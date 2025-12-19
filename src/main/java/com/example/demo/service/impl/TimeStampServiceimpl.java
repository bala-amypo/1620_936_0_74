

---------- Forwarded message ---------
From: 727824TUCS257 PAVEESH M <727824tucs257@skct.edu.in>
Date: Fri, Dec 19, 2025 at 8:24 AM
Subject:
To: <7272824tucs215@skct.edu.in>


package com.example.demo.service.impl;

import com.example.demo.entity.TimeStampEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TimeStampRepository;
import java.util.List;
@Service
public class TimeStampServiceImpl implements TimeStampService{

     @Autowired TimeStampRepository repo;
        
    @Override
    TimeStampEntity postStamp(TimeStampEntity time){
        return repo.save(time);
    }
   
}



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