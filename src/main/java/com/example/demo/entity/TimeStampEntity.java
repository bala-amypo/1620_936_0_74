package com.example.demo.entity;

import jakarta.validation.constraints.*;
import jakata.persistence.*;
import lombok.*;
import java.util.*;
@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @prepersist
    public void  Oncreate(){
        LocalDateTime now = LocalDateTime().now();
        this.createdAt = now;
        this.updatedAt = now;
        
    }
}