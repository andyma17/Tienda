package com.tienda.service.impl;


import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

       @Autowired
    private ProductoDao categoriaDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Producto> getProductos(boolean activos) {
        var lista = categoriaDao.findAll();
        if(activos){
            lista.removeIf(categoriaEletemento -> !categoriaEletemento.isActivo() );
        }
        return lista;        
    }
    
    @Override
    @Transactional(readOnly=true)//leer
    public Producto getProducto(Producto categoria){
        return categoriaDao.findById(categoria.getIdProducto()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Producto categoria){//agrega algo
        categoriaDao.save(categoria);
    }
    
    @Override
    @Transactional
    public void delete(Producto categoria){//alimina
        categoriaDao.delete(categoria);
    }
}

