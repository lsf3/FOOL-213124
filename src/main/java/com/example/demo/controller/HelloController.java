package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		@PostMapping(value="/insertEmp")
		public String postform(Employee employee,Model model) {
			System.out.println(employee+"---------------------------------");
			Integer insertEmp = employeeService.insertEmp(employee);
			model.addAttribute("line", insertEmp);
			return "success";
		}
		@RequestMapping(value="/toIndex")
		public String postform1(Model model,HttpServletRequest request ) {
			model.addAttribute("lastName", "zhangsan");
			model.addAttribute("email", "zhangsan@yahu.com");
			model.addAttribute("gender", "1");
			model.addAttribute("dId", "1");
			
			model.addAttribute("date",new Date());
			
			List<Employee> list=new ArrayList<Employee>() ;
			list.add(new Employee(1,"li",0,"li@xinlang.com",1));
			list.add(new Employee(2,"liS",1,"liS@xinlang.com",2));
			list.add(new Employee(3,"liSi",1,"liSi@xinlang.com",1));
			list.add(new Employee(4,"liShi",0,"liShi@xinlang.com",3));
			model.addAttribute("list", list);
			
			Map<String, Employee> map=new TreeMap<String, Employee>();
			map.put("s1", new Employee(1,"zs",0,"zs@xinlang.com",1));
			map.put("s2", new Employee(2,"li",1,"li@xinlang.com",2));
			map.put("s3", new Employee(3,"ww",0,"ww@xinlang.com",1));
			map.put("s4", new Employee(4,"zl",0,"zl@xinlang.com",1));
			model.addAttribute("map",map);
			
			request.setAttribute("req", "HtttpServletRequest1");
			request.getSession().setAttribute("sess", "HttpSession1");
			request.getSession().getServletContext().setAttribute("app", "Application1");
			
			
			
			return "index";
			
		}

}
