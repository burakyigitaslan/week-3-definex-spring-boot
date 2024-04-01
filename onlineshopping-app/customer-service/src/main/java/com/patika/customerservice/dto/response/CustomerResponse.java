package com.patika.customerservice.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CustomerResponse {
    private Long customerId;
    private LocalDateTime createDate;
}
