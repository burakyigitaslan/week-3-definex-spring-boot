package com.patika.productservice.repository;

import com.patika.productservice.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> productList = new ArrayList<>();

    public Product save(Product product) {
        productList.add(product);
        return product;
    }

    public List<Product> getAll() {
        return productList;
    }
}
