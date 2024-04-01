package com.patika.onlineshopping.model;

import com.patika.onlineshopping.enums.OrderStatus;
import com.patika.onlineshopping.enums.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private HashMap<Product, Integer> products;
    private LocalDateTime orderDate;
    private PaymentMethod paymentMethod;
    private OrderStatus status;
    private Invoice invoice;

    public void addProduct(Product product, Integer quantity) {
        this.products.put(product,quantity);
    }

    public double calculateTotalAmount(){
        double totalAmount = 0.0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Double price = entry.getKey().getPrice();
            Integer quantity = entry.getValue();
            totalAmount+=price*quantity;
        }
        return totalAmount;
    }

}
