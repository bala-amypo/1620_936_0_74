package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.TimeStampService;

@Service
public class TimeStampServiceimpl implements TimeStampService{
    @Autowired TimeStampRepository student;
    @Override
     public TimeStampEntity postStamp(TimeStampEntity stu){
        return student.save(stu);
     }
}