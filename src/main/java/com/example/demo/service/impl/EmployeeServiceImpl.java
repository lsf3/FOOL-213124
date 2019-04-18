package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeMapper employeeMapper;

	@Override
	public Employee selectEmpById(Integer id) {
		// TODO Auto-generated method stub
		return employeeMapper.selectEmployeeById(id);
	}

	@Override
	public Integer insertEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.insertEmp(employee);
	}
	

}
