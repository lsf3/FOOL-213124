package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;


public interface EmployeeService {
	
	Employee selectEmpById(Integer id);
	
	Integer insertEmp(Employee employee);
}
