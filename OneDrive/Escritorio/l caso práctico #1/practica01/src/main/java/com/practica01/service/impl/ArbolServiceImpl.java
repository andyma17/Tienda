
package com.practica01.service.impl;

import com.practica01.dao.ArbolDao;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

   
    @Transactional(readOnly = true)
    public List<Arbol> getArboles(boolean activos) {
        var lista = arbolDao.findAll();
        if (activos) {
            lista.removeIf(arbolEletemento -> !arbolEletemento.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)//leer
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Arbol arbol) {//agrega algo
        arbolDao.save(arbol);
    }

    @Override
    @Transactional
    public void delete(Arbol arbol) {//alimina
        arbolDao.delete(arbol);
    }


    
}
