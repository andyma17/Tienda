
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    // Se obtiene un listado de categorias en un List
     public List<Producto> getProductos(boolean activos);

    //se obtiene una categoria a partir del id de una categoria
    public Producto getProducto(Producto producto);

    public void save(Producto producto);

    //se elimina el categoria que tiene el id pasado por parametro
    public void delete(Producto producto);
    
}