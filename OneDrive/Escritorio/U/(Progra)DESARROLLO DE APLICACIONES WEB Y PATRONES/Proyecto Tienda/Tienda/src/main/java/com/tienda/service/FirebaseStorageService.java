/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Andy Madrigal
 */
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //BucketName es el <id del proyecto> +.appspot.com
    final String BucketName = "techsop-8b6ff.appspot.com";//se ve en la pagina de Firebase

    final String rutaSuperiorStorage = "techshop";//nombre del proyecto

    final String rutaJsonFile = "firebase";//folder donde esat el archivo json

    final String archivoJsonFile = "techsop-8b6ff-firebase-adminsdk-vgz08-a32962102c";//cambia de persona a persona

}
