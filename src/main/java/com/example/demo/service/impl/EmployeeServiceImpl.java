package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public Employee selectEmpById(Integer id) {
		// TODO Auto-generated method stub
		return employeeMapper.selectEmployeeById(id);
	}
	

}
