package com.marketapi.persistence.crud;

import com.marketapi.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository <Producto, Integer>{


    //@Query(value = "SELECT * FROM productos WHERE id_categoria =?", nativeQuery = true)
    public List<Producto> findByIdCategoria(int idCategoria);

   public  List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


}
