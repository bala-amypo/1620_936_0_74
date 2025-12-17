package com.example.demo.service.Impl;

import org.springframework.stereotype.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.StudentRepository;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@service
public class StudentServiceImpl implements StudentService {
    @Autowired StudentRepository student;
    //save()
    //findAll()
    //findById()
    //deleteById();
    //existByid();
        public StudentEntity postData(StudentEntity stu){
            return student.save(stu);

        }       
}