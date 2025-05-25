package com.syitogluhalit.demo.controller;

import com.syitogluhalit.demo.dto.DtoCustomer;

public interface ICustomerController {

	DtoCustomer findCustomerById(Long id);
      
}
