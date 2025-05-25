package com.syitogluhalit.demo.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syitogluhalit.demo.dto.DtoAddress;
import com.syitogluhalit.demo.dto.DtoCustomer;
import com.syitogluhalit.demo.entities.Address;
import com.syitogluhalit.demo.entities.Customer;
import com.syitogluhalit.demo.repository.CustomerRepository;
import com.syitogluhalit.demo.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{
	
	
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public DtoCustomer findCustomerById(Long id) {
	
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		
	Optional<Customer> optional = customerRepository.findById(id);
	if(optional.isEmpty()) {
		return null;
	}
	Customer customer = optional.get();
	Address adress = optional.get().getAddress();
	BeanUtils.copyProperties(customer, dtoCustomer);
	BeanUtils.copyProperties(adress, dtoAddress);
	
	dtoCustomer.setAddress(dtoAddress);
		return dtoCustomer;
	}

	
}
