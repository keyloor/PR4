package com.example.demo.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dtos.ProductDto;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.services.IProductService;

//La Facade coordina Services y Mappers. Oculta complejidad al Controller.
public class ProductFacade implements IProductFacade {

    @Autowired
    IProductService productService;

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDto> getAll() {
        return productMapper.toProductDtoList(productService.getAll());

    }

}
