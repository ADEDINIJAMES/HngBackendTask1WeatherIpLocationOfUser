package com.example.HNGBackendTask1.uitils;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientIp {
    public String getClientIp(HttpServletRequest request) {
        String clientIp = request.getHeader("X-Forwarded-For");
        if (clientIp != null && !clientIp.isEmpty()) {
            return clientIp.split(",")[0];
        }

        clientIp = request.getHeader("X-Real-IP");
        if (clientIp != null && !clientIp.isEmpty()) {
            return clientIp;
        }

        if (request.getHeader("Forwarded") != null) {
            String forwarded = request.getHeader("Forwarded");
            String[] parts = forwarded.split(";");
            for (String part : parts) {
                if (part.trim().startsWith("for=")) {
                    return part.substring(4).trim();
                }
            }
        }

        clientIp = request.getRemoteAddr();
        if ("0:0:0:0:0:0:0:1".equals(clientIp) || "127.0.0.1".equals(clientIp)) {
            // Mock IP address for local testing
            clientIp = "8.8.8.8";
        }

        return clientIp;
    }
}
