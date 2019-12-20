package com.front.meler.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PatientController {
    RestTemplate restTemplate = new RestTemplate();
    String getPatient = "http://localhost:8080/patient";
    @GetMapping("/patient")
    public ResponseEntity<String> getPatient() {


        return restTemplate.getForEntity(getPatient, String.class);

    }
}
