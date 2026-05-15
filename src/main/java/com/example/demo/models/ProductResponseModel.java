package com.example.demo.models;

import java.math.BigDecimal;

/*
Los Models representan los datos que la API expone hacia afuera.

Aunque parecen similares a los DTO, normalmente los Models se usan 
específicamente para definir la respuesta final que verá el cliente.
 */
public record ProductResponseModel(
        String name,
        String description,
        BigDecimal price
        ) {

}
