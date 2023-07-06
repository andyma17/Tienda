package com.practica01.controller;

import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import com.practica01.service.FirebaseStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;



    @Controller
    @Slf4j
    @RequestMapping("/arbol")//busca esta ruta
    public class ArbolController {

        @Autowired
        private ArbolService arbolService;

        @GetMapping("/listado")//busca esta ruta se trae informacion 
        public String inicio(Model model) {
            var arboles = arbolService.getArboles(false);
            model.addAttribute("arboles", arboles);
            model.addAttribute("totalArboles", arboles.size());
            return "/arbol/listado";
        }

        @GetMapping("/nuevo")
        public String arbolNuevo(Arbol arbol) {
            return "/arbol/modifica";
        }

        
        private FirebaseStorageService firebaseStorageservice;

        @PostMapping("/guardar")
        public String arbolGuardar(Arbol arbol,
                @RequestParam("imagenFile") MultipartFile imagenFile) {
            if (!imagenFile.isEmpty()) {
                arbolService.save(arbol);
                arbol.setRutaImagen(
                        firebaseStorageservice.cargaImagen(imagenFile, "arbol", arbol.getIdArbol()));
            }
            arbolService.save(arbol);
            return "redirect:/arbol/listado";
        }

        @GetMapping("/eliminar/{idArbol}")
        public String arbolEliminar(Arbol Arbol) {
            arbolService.delete(Arbol);
            return "redirect:/arbol/listado";
        }

        @GetMapping("/modificar/{idArbol}")
        public String arbolModificar(Arbol arbol, Model model) {
            arbol = arbolService.getArbol(arbol);
            model.addAttribute("arbol", arbol);
            return "/arbol/modifica";
        }

    }
