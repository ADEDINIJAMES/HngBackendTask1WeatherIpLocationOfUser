package com.example.HNGBackendTask1.service;

import com.example.HNGBackendTask1.pojo.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;

public interface ClientLocationService {
    ApiResponse getClientLocationWeather ( String username, HttpServletRequest request);
}
