package com.example.demo.controller;

import com.example.demo.controller.response.MyResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/home")
    public ResponseEntity home()
    {
        return new ResponseEntity(new MyResponse("Rahul Sinha is my name !"), HttpStatus.OK);
    }
}
