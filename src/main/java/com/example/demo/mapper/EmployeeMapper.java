package com.example.demo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.Employee;


//@Mapper
public interface EmployeeMapper {
	@Select("seclect * from employee where id=#{id}")
	Employee selectEmployeeById(@Param("id")Integer id);


}
