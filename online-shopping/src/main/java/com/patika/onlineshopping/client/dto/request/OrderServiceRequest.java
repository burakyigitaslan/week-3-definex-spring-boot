package com.patika.onlineshopping.client.dto.request;

import com.patika.onlineshopping.dto.request.OrderRequest;
import com.patika.onlineshopping.enums.OrderStatus;
import com.patika.onlineshopping.enums.PaymentMethod;
import com.patika.onlineshopping.model.Invoice;
import com.patika.onlineshopping.model.Product;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderServiceRequest {
    //private HashMap<Product, Integer> products;
    private LocalDateTime orderDate;
    private PaymentMethod paymentMethod;
    private OrderStatus status;
    private Invoice invoice;

    public OrderServiceRequest(OrderRequest request) {
        //this.products = request.getProducts();
        this.orderDate = request.getOrderDate();
        this.paymentMethod = request.getPaymentMethod();
        this.status = request.getStatus();
        this.invoice = request.getInvoice();
    }
}
