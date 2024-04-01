package com.patika.orderservice.entity;


import com.patika.orderservice.enums.OrderStatus;
import com.patika.orderservice.enums.PaymentMethod;
import com.patika.orderservice.dto.request.OrderRequest;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long orderId;
    private LocalDateTime createDate;
    //private HashMap<Product, Integer> products;
    private LocalDateTime orderDate;
    private PaymentMethod paymentMethod;
    private OrderStatus status;
    private Invoice invoice;

    public Order(OrderRequest request) {
        this.orderId=new Random().nextLong();
        this.createDate=LocalDateTime.now();
        //this.products = request.getProducts();
        this.orderDate = request.getOrderDate();
        this.paymentMethod = request.getPaymentMethod();
        this.status = request.getStatus();
        this.invoice = request.getInvoice();
    }
}

