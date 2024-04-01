package com.patika.invoiceservice.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvoiceRequest {
    private String name;
    private LocalDate invoiceDate;
    private Double totalAmount;
}
