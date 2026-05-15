package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.facade.IProductFacade;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.models.ProductResponseModel;

//Recibe peticiones HTTP (GET, POST, PUT, DELETE)
@RestController //Hace que cada método de esa clase se mapea automáticamente a una ruta URL y responde a las solicitudes HTTP entrantes en función de las anotaciones.
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductFacade productFacade;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping
    public ResponseEntity<List<ProductResponseModel>> findAll() {
        return ResponseEntity.ok(productMapper.toProductResponseModelList(productFacade.getAll()));
    }

}
