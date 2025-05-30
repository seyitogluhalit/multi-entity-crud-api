package com.syitogluhalit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syitogluhalit.demo.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
