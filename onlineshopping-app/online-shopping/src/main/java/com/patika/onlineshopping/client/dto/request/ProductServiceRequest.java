package com.patika.onlineshopping.client.dto.request;

import com.patika.onlineshopping.dto.request.ProductRequest;
import com.patika.onlineshopping.enums.ProductCategory;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductServiceRequest {
    private String name;
    private ProductCategory category;
    private Double price;
    private Double discountRate;
    private Integer stock;
    private String description;
    private String imageUrl;

    public ProductServiceRequest(ProductRequest request) {
        this.name = request.getName();
        this.category = request.getCategory();
        this.price = request.getPrice();
        this.discountRate = request.getDiscountRate();
        this.stock = request.getStock();
        this.description = request.getDescription();
        this.imageUrl = request.getImageUrl();
    }
}
