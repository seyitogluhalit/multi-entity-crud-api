package com.syitogluhalit.demo.controller.impl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syitogluhalit.demo.controller.IEmployeeController;
import com.syitogluhalit.demo.dto.DtoEmployee;
import com.syitogluhalit.demo.services.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImp implements IEmployeeController{

	private IEmployeeService employeeService;
	
	@GetMapping(path = "list")
	@Override
	public List<DtoEmployee> findAllEmployees() {
		return employeeService.findAllEmployees();
	}

}
