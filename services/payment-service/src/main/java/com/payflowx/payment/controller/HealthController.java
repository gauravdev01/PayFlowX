package com.payflowx.payment.controller;

import com.payflowx.payment.common.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/api/v1/health")
    public ApiResponse<Map<String, Object>> health() {

        return ApiResponse.<Map<String, Object>>builder()
                .success(true)
                .message("Payment Service is healthy")
                .data(Map.of(
                        "service", "payment-service",
                        "status", "UP",
                        "timestamp", Instant.now()
                ))
                .build();
    }
}