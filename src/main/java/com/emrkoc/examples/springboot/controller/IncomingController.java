package com.emrkoc.examples.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/ws/v0/testEndpoint")
public class IncomingController {

    @Autowired
    public IncomingController(){}

    @PostMapping
    public ResponseEntity<String> handleIncoming(String msg){
        return new ResponseEntity<String>("Test Response", HttpStatus.OK);
    }
}
