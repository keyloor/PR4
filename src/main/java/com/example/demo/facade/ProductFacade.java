package com.example.demo.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dtos.ProductDto;
import com.example.demo.mappers.ProductMapper;
import com.example.demo.services.IProductService;

//La Facade coordina Services y Mappers. Oculta complejidad al Controller.
@Component
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
