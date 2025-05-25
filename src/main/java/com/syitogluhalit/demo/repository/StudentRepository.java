package com.syitogluhalit.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syitogluhalit.demo.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
     //Buralara özel metotlarımız yazılır
	
	//HQL: sınıf ismi ve değişken isimleri kullanılarak sorgular yazılırı
	//SQL:tablo ismi ve tablo içerisindeki kolon ismi ile sorgular yazılır
	
	@Query(value = "from Student",nativeQuery =false)
	List <Student> findAllStudents();
	
}
