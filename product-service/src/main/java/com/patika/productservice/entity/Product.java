package com.patika.productservice.entity;


import com.patika.productservice.dto.request.ProductRequest;
import com.patika.productservice.enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long productId;
    private LocalDateTime createDate;
    private String name;
    private ProductCategory category;
    private Double price;
    private Double discountRate;
    private Integer stock;
    private String description;
    private String imageUrl;

    public Product(ProductRequest request) {
        this.productId = new Random().nextLong();
        this.createDate = LocalDateTime.now();
        this.name = request.getName();
        this.category = request.getCategory();
        this.price = request.getPrice();
        this.discountRate = request.getDiscountRate();
        this.stock = request.getStock();
        this.description = request.getDescription();
        this.imageUrl = request.getImageUrl();
    }

}
