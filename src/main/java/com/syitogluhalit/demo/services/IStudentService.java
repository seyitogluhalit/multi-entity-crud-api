package com.syitogluhalit.demo.services;

import java.util.List;

import com.syitogluhalit.demo.dto.DtoStudent;
import com.syitogluhalit.demo.dto.DtoStudentIU;
import com.syitogluhalit.demo.entities.Student;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);
    
    public List<DtoStudent> getAllStudents();
    
    public DtoStudent getStudentById(Integer id);
    
    public void deleteStudent(Integer id);
    
    public DtoStudent updateStudent(Integer id,DtoStudentIU dtoStudentIU);
}
