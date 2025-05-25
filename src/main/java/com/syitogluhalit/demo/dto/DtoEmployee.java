package com.syitogluhalit.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DtoEmployee {

	private Long id;
	
	private String name;
	
	private DtoDepartment department;
}
