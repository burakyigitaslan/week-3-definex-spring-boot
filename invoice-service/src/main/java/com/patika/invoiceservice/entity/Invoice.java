package com.patika.invoiceservice.entity;

import com.patika.invoiceservice.dto.request.InvoiceRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private Long invoiceId;
    private LocalDateTime createDate;
    private String name;
    private LocalDate invoiceDate;
    private Double totalAmount;

    public Invoice(InvoiceRequest request){
        this.invoiceId=new Random().nextLong();
        this.createDate=LocalDateTime.now();
        this.name=request.getName();
        this.invoiceDate=request.getInvoiceDate();
        this.totalAmount= request.getTotalAmount();
    }
}
