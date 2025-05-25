package com.syitogluhalit.demo.services;

import org.springframework.stereotype.Service;

import com.syitogluhalit.demo.dto.DtoHome;

@Service
public interface IHomeService {
	
	public DtoHome findHomeById(Long id);
	
}
