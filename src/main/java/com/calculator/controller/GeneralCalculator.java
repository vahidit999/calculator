package com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.service.Calculator;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
public class GeneralCalculator {
	
	@Autowired
	private Calculator calculator;
	
    @PostMapping(value = "v1/getString")
    public ResponseEntity<String> testMethod (@RequestBody String value){
    	return ResponseEntity.ok().body("your value : " + calculator.calculateStatement(value)); 
    }
}
