package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.bean.Employee;


@Mapper
public interface EmployeeMapper {
	@Select("select * from employee where id=#{id}")
	Employee selectEmployeeById(@Param("id")Integer id);
	
	
	@Options(useGeneratedKeys=true,keyProperty="id")
	@Insert("insert into employee(lastName,email,gender,d_id)values(#{lastName},#{email},#{gender},#{dId}) ")
	Integer insertEmp(Employee employee);

}
