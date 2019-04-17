package com.example.demo.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeService;


@Controller
public class HelloController {
	@Autowired
	EmployeeService employeeService;
		
		@GetMapping("/show")
		public String showInfo3(Model model){
			java.util.List<Employee> list = new ArrayList();
			list.add(new Employee(1,"LSF",1,"L-SF@qq.com",1));
			list.add(new Employee(2,"sss",0,"sss@qq.com",1));
			list.add(new Employee(3,"张三",1,"张三@123.com",2));
			list.add(new Employee(4,"李四",0,"李四@123.com",2));
			list.add(new Employee(5,"王五",1,"王五@123.com",3));
			model.addAttribute("list", list);
			return "lsf";
		}
		
		
		@GetMapping(value="/selectAllEmp/{id}")
		public String selectEmpById(@PathVariable(value="id")Integer id,Model model) {
			Employee selectAllEmployeeById = employeeService.selectEmpById(id);
			java.util.List<Employee> list = new ArrayList<Employee>();
			list.add(selectAllEmployeeById);
			model.addAttribute("list", list);
			return "lsf";
		}

}
