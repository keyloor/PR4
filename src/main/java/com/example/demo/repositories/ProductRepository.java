package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;

//El Repository es la capa que habla directamente con la base de datos
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    default List<Product> getAll() {
        return findAll();
    }

}
