package com.patika.onlineshopping.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InvoiceRequest {
    private String name;
    private LocalDate invoiceDate;
    private Double totalAmount;

}
