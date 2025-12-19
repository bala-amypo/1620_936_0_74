package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private LocalDateTime createAt;
     private LocalDateTime updateAt;
     @PrePersist
     public void Oncreate(){
        LocalDateTime now=LocalDateTime.now();
        this.createAt=now;
        this.updateAt=now;
     }
     @PreUpdate
     public void Onupdate(){
        LocalDateTime now=LocalDateTime.now();
        this.updateAt=now;
        }
    }