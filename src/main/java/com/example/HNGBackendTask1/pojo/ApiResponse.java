package com.example.HNGBackendTask1.pojo;

import lombok.Getter;

@Getter
public class ApiResponse {
    private String client_ip;
    private String location;
    private String greeting;

    public ApiResponse(String client_ip, String location, String greeting) {
        this.client_ip = client_ip;
        this.location = location;
        this.greeting = greeting;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public ApiResponse() {
    }
}
