package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;

@RestController
public class TimeStampController{
     @Autowired TimeStampService ser; 
   @PostMapping("/post3")
   public TimeStampEntity sendData(@RequestBody TimeStampEntity stu){
     return ser.postStamp(stu);
   }
}