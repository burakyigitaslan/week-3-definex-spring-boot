package com.patika.productservice.service;

import com.patika.productservice.converter.ProductConverter;
import com.patika.productservice.dto.request.ProductRequest;
import com.patika.productservice.dto.response.ProductResponse;
import com.patika.productservice.entity.Product;
import com.patika.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    private final ProductConverter productConverter;

    public ProductResponse save(ProductRequest request) {

        Product product = productConverter.toProduct(request);

        return productConverter.toResponse(productRepository.save(product));
    }


    public List<ProductResponse> getAll() {
        List<Product> products = productRepository.getAll();

        return productConverter.toResponseList(products);
    }
}
