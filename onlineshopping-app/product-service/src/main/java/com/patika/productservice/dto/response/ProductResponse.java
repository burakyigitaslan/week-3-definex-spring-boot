package com.patika.productservice.dto.response;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductResponse {
    private Long productId;
    private LocalDateTime createDate;
}
