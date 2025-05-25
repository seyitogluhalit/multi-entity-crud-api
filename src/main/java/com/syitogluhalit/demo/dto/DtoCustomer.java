package com.syitogluhalit.demo.dto;



import com.syitogluhalit.demo.entities.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCustomer {

	   private Long id;
	   

	   private String name;
	   
	   private DtoAddress address;
	   
}
