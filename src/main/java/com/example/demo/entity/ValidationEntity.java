package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min=2,max=6,message="require 2 to 6 characters")
private String name;
@Email(message="Email is not valid")
private String email;
@Size(min=2,max=6,message="should be less than 6")
@NotNull
private String password;
@Max(35)
@Positive(message="Age cannot be negative")
private int age;

 
}