package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import jakarta.validation.Valid;

@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/posttt")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
            return ser.postdata(stu);
    }

    @GetMapping("/put/{id}")
    public ValidationEntity getData(@PathVariable int id){
        return ser.getData(id);
    }
}