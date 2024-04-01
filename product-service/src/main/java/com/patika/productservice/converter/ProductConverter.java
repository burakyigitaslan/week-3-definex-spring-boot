package com.patika.productservice.converter;

import com.patika.productservice.dto.request.ProductRequest;
import com.patika.productservice.dto.response.ProductResponse;
import com.patika.productservice.entity.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductConverter {
    public Product toProduct(ProductRequest request){
        return new Product(request);
    }

    public ProductResponse toResponse(Product product){
        return ProductResponse.builder()
                .productId(product.getProductId())
                .createDate(product.getCreateDate())
                .build();
    }

    public List<ProductResponse> toResponseList(List<Product> products){
        List<ProductResponse> productResponses = new ArrayList<>();

        products.forEach(product -> {
            productResponses.add(toResponse(product));
        });

        return productResponses;
    }
}
