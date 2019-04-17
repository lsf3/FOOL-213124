package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;


@Service
public interface EmployeeService {
	
	Employee selectEmpById(Integer id);

}
