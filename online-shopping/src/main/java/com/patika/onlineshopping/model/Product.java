package com.patika.onlineshopping.model;

import com.patika.onlineshopping.enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private ProductCategory category;
    private Double price;
    private Double discountRate;
    private Integer stock;
    private String description;
    private String imageUrl;
}
