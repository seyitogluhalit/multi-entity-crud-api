package com.syitogluhalit.demo.controller;

import java.util.List;

import com.syitogluhalit.demo.dto.DtoStudent;
import com.syitogluhalit.demo.dto.DtoStudentIU;

public interface IStudentController {
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id); 
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
