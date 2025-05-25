package com.syitogluhalit.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syitogluhalit.demo.dto.DtoDepartment;
import com.syitogluhalit.demo.dto.DtoEmployee;
import com.syitogluhalit.demo.entities.Employee;
import com.syitogluhalit.demo.repository.EmployeeRepository;
import com.syitogluhalit.demo.services.IEmployeeService;

@Service
public class EmployeeserviceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findAllEmployees() {
        List<DtoEmployee> dtoEmployeeList = new ArrayList<>();

        List<Employee> employeeList = employeeRepository.findAll();
        if (employeeList != null && !employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                DtoEmployee dtoEmployee = new DtoEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                // 👇 Constructor doğru şekilde çağrılıyor
                dtoEmployee.setDepartment(new DtoDepartment(
                        employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()
                ));

                dtoEmployeeList.add(dtoEmployee);
            }
        }

        return dtoEmployeeList;
    }
}
