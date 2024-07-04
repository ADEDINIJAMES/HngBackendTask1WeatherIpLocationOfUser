package com.example.HNGBackendTask1.controller;

import com.example.HNGBackendTask1.service.ClientLocationService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientGreetingController {

    private ClientLocationService clientLocationService;
    @Autowired
    public ClientGreetingController(ClientLocationService clientLocationService){
        this.clientLocationService= clientLocationService;
    }
    @GetMapping("/")
    public ResponseEntity<?> greetUser ( @RequestParam(name = "username") String username, HttpServletRequest request){
   return ResponseEntity.ok( clientLocationService.getClientLocationWeather(username, request));
    }
}
