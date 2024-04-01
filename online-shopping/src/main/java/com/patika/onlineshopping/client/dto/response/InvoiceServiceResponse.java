package com.patika.onlineshopping.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceServiceResponse {
    private Long invoiceId;
    private LocalDateTime createDate;
}
