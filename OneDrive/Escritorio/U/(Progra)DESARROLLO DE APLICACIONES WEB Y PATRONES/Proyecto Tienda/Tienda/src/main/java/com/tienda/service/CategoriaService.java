package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);

    //se obtiene una categoria a partir del id de una categoria
    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);

    //se elimina el categoria que tiene el id pasado por parametro
    public void delete(Categoria categoria);

}
