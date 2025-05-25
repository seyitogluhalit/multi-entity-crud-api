package com.syitogluhalit.demo.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "First name alanı boş bırakılamaz")
	 private String firstName;
	
	 private String lastName;
	 
	 private Date birthOfDate;
	 
	 @Size(min=11,max=11 , message = "Tckn alanı 11 karakter olmalıdır")
	 @NotEmpty(message = "Tckn boş geçilemez")
	 private String tckn;
 
}
