package com.patika.orderservice.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class OrderResponse {
    private Long orderId;
    private LocalDateTime createDate;
}
