package com.front.meler.controller;
import com.front.meler.model.PatientDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;

@Controller
public class PatientController {
    RestTemplate restTemplate = new RestTemplate();
    String getPatient = "http://localhost:8080/api/patient";

    @GetMapping("/patient")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PatientDto[]> getPatient() {

        PatientDto[] forEntity = restTemplate.getForObject(getPatient, PatientDto[].class);
        PatientDto[] body = forEntity;
        System.out.println(body[1].getName());

        return  new ResponseEntity<>(forEntity, HttpStatus.OK) ;

    }
}
