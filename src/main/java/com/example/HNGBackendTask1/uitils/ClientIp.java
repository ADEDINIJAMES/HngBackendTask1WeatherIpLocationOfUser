package com.example.HNGBackendTask1.uitils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientIp {
    private RestTemplate restTemplate;

    @Autowired
    public ClientIp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getClient() {
        return restTemplate.getForObject("https://api.ipify.org", String.class);
    }
}
