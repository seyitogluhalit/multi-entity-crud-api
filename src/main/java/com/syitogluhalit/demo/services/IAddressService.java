package com.syitogluhalit.demo.services;

import com.syitogluhalit.demo.dto.DtoAddress;

public interface IAddressService {

	public DtoAddress findAddressById(Long id);
}
