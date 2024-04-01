package com.patika.onlineshopping.dto.request;

import com.patika.onlineshopping.enums.OrderStatus;
import com.patika.onlineshopping.enums.PaymentMethod;
import com.patika.onlineshopping.model.Invoice;
import com.patika.onlineshopping.model.Product;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    //private HashMap<Product, Integer> products;
    private LocalDateTime orderDate;
    private PaymentMethod paymentMethod;
    private OrderStatus status;
    private Invoice invoice;
}
