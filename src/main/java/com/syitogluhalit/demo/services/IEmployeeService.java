package com.syitogluhalit.demo.services;

import java.util.List;

import com.syitogluhalit.demo.dto.DtoEmployee;

public interface IEmployeeService {

	public List <DtoEmployee> findAllEmployees();
}
