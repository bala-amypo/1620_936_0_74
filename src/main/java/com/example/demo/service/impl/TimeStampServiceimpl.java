

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


