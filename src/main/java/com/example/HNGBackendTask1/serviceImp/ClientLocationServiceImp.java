package com.example.HNGBackendTask1.serviceImp;

import com.example.HNGBackendTask1.pojo.Location;
import com.example.HNGBackendTask1.pojo.ApiResponse;
import com.example.HNGBackendTask1.uitils.ClientIp;
import com.example.HNGBackendTask1.uitils.ClientLocation;
import com.example.HNGBackendTask1.uitils.ClientWeather;
import com.example.HNGBackendTask1.pojo.Weather;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientLocationServiceImp implements com.example.HNGBackendTask1.service.ClientLocationService {
private ClientIp clientIp;
private ClientLocation clientLocation;
private ClientWeather clientWeather;
@Autowired
    public ClientLocationServiceImp(ClientIp clientIp, ClientLocation clientLocation, ClientWeather clientWeather) {
        this.clientIp = clientIp;
        this.clientLocation = clientLocation;
        this.clientWeather = clientWeather;
    }

    @Override
    public ApiResponse getClientLocationWeather(String username, HttpServletRequest request) {
        String ipAddress= clientIp.getClientIp(request);
        Location location= clientLocation.getUserLocation(ipAddress);
        double lat = location.getLat();
        double lon = location.getLon();
        String city = location.getCity();
        Weather weather = clientWeather.getClientWeather(city);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setClient_ip(ipAddress);
        apiResponse.setLocation(location.getCity());
        apiResponse.setGreeting("Hello, "+username+"!,"+" the temperature is "+weather.getCurrent().getTemp_c()+" degree Celcius in "+location.getCity());


        return apiResponse;
    }
}
