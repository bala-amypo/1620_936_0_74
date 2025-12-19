package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;
import jakarta.validation.Valid;
@RestController
public class ValidationController{
    @Autowired TimeStampService serve;
    
    @PostMapping("/postTS")                                                                                                  
    public TimeStampEntity postSt(@RequestBody TimeStampEntity time){
        return serve.postStamp(time);
    }
}