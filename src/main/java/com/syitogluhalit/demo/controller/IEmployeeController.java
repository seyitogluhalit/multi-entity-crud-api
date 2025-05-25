package com.syitogluhalit.demo.controller;

import java.util.List;

import com.syitogluhalit.demo.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees();
}
