package com.patika.onlineshopping.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    private String name;
    private LocalDate invoiceDate;
    private Double totalAmount;

}
