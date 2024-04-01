package com.patika.onlineshopping.client.dto.request;

import com.patika.onlineshopping.dto.request.InvoiceRequest;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvoiceServiceRequest {
    private String name;
    private LocalDate invoiceDate;
    private Double totalAmount;

    public InvoiceServiceRequest(InvoiceRequest request) {
        this.name = request.getName();
        this.invoiceDate = request.getInvoiceDate();
        this.totalAmount = request.getTotalAmount();
    }
}
