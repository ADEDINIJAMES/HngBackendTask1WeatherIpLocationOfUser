package com.example.HNGBackendTask1.uitils;

import com.example.HNGBackendTask1.pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ClientWeather {
    private RestTemplate restTemplate;
    @Value("${API_Key}")
    private String myApiKey;

    @Autowired
    public ClientWeather(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Weather getClientWeather(String city) {
        String apiKey =myApiKey ;
        String url = String.format( "http://api.weatherapi.com/v1/current.json?key="+apiKey+"&"+"q="+city);
        return restTemplate.getForObject(url, Weather.class);
    }


}


