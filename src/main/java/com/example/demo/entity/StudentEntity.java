package com.example.demo.entity;

import java.util.Date; 

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String username;
    private String password;
    private Date created;
    

    public Date getCreated(){
        return created;
    }
    public void setCreated(Date created){
        this.created = created;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.name = Name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public StudentEntity(Integer id, String username, String  email, String  password,Date created){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.date=date;
    }
    public  StudentEntity(){

    }


}