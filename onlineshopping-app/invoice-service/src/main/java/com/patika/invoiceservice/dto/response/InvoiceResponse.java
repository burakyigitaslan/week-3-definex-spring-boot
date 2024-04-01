package com.patika.invoiceservice.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class InvoiceResponse {
    private Long invoiceId;
    private LocalDateTime createDate;
}
