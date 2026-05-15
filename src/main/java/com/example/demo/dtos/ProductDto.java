package com.example.demo.dtos;

import java.math.BigDecimal;
import java.util.UUID;

// Los DTO transportan información entre capas sin exponer directamente la Entity.
public record ProductDto(
        String name,
        String description,
        BigDecimal price,
        UUID resource_id) {

}
