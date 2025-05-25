package com.syitogluhalit.demo.controller;

import com.syitogluhalit.demo.dto.DtoAddress;

public interface IAddressController {
	public DtoAddress findAddressById(Long id);
}
