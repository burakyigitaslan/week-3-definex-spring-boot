package com.patika.onlineshopping.dto.request;

import com.patika.onlineshopping.enums.ProductCategory;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductRequest {
    private String name;
    private ProductCategory category;
    private Double price;
    private Double discountRate;
    private Integer stock;
    private String description;
    private String imageUrl;
}
