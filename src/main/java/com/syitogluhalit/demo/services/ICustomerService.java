package com.syitogluhalit.demo.services;

import com.syitogluhalit.demo.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);

}
