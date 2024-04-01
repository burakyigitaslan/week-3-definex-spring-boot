package com.patika.onlineshopping.service;

import com.patika.onlineshopping.client.ProductServiceClient;
import com.patika.onlineshopping.client.dto.request.ProductServiceRequest;
import com.patika.onlineshopping.client.dto.response.ProductServiceResponse;
import com.patika.onlineshopping.dto.request.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductServiceClient productServiceClient;

    public ProductServiceResponse save(ProductRequest request) {
        return productServiceClient.save(prepareProductServiceRequest(request));
    }

    public ProductServiceRequest prepareProductServiceRequest(ProductRequest request) {

        return new ProductServiceRequest(request);
    }

    public List<ProductServiceResponse> getAll() {
        return productServiceClient.getAll();
    }
}
