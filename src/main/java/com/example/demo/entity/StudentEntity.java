package com.example.demo.entity



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.parsistence.Id;

@Entity
public class StudentEntity(){
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String username;
    private String password;
    private Date createde;

    public date getCreated(){
        return created;
    }
    public void setCreated(Date created){
        this.created = created
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
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
    public SampleEnitty(Integer id, String username, String  email, String  password,String)


}