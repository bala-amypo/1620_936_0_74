package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;
@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String address;

}