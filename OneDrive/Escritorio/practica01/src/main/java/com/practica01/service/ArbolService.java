
package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;


public interface ArbolService {
    
       // Se obtiene un listado de categorias en un List
    public List<Arbol> getArboles(boolean activos);

    //se obtiene una categoria a partir del id de una categoria
    public Arbol getArbol(Arbol arbol);

    public void save(Arbol arbol);

    //se elimina el categoria que tiene el id pasado por parametro
    public void delete(Arbol arbol);
    
}
