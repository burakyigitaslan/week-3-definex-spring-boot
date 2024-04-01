package com.patika.orderservice.dto.request;

import com.patika.orderservice.entity.Invoice;
import com.patika.orderservice.entity.Product;
import com.patika.orderservice.enums.OrderStatus;
import com.patika.orderservice.enums.PaymentMethod;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderRequest {
    //private HashMap<Product, Integer> products;
    private LocalDateTime orderDate;
    private PaymentMethod paymentMethod;
    private OrderStatus status;
    private Invoice invoice;
}
