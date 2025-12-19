
727825TUCS803 MADURKRISHNA RS <727825tucs803@skct.edu.in>
9:28 AM (0 minutes ago)
to me

package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
        StudentEntity postdata(StudentEntity stu);
        List<StudentEntity>getAllData();
        String DeleteData(int id);
        StudentEntity getData(int id);
        StudentEntity updateData(int id,StudentEntity entity);
}