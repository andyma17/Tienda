
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
    
    
    //Codigo para la consultas
    // Lista de productos con precio entre pedidos por descripción ConsultaAmpliada
public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);


 //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}