package com.kk.SpringMVCproject.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
