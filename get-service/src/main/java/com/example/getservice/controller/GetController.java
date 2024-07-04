package com.example.getservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class GetController {

    //private final PersonServiceUtil personServiceUtil;

    @GetMapping
    public ResponseEntity<String> fetchPersons(){
        return ResponseEntity.ok("COŚ");
    }
}
