package com.example.HNGBackendTask1.uitils;

import com.example.HNGBackendTask1.pojo.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ClientLocation {
    private RestTemplate restTemplate;
@Autowired
    public ClientLocation(RestTemplate restTemplate){
        this.restTemplate= restTemplate;
    }
public Location getUserLocation(String ip){
    String url = String.format("http://ip-api.com/json/%s",ip);
    return restTemplate.getForObject(url, Location.class);

}

}
