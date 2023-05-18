package com.marketapi.persistence;

import com.marketapi.persistence.crud.ProductoCrudRepository;
import com.marketapi.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll(){
      return (List<Producto>)  productoCrudRepository.findAll();
    }
    public List<Producto>getByCategoria(int idCategoria){
        return  productoCrudRepository.findByIdCategoriaOrderByNombreAsc((idCategoria));
    }
}
