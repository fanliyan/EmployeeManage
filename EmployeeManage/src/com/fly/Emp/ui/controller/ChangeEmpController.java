package com.fly.Emp.ui.controller;

import java.io.IOException;
import java.sql.Timestamp;

import com.fly.Emp.model.Employee;
import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.service.IEmployeeService;
import com.fly.Emp.service.impl.EmployeeService;

public class ChangeEmpController extends AbstractController {

	private IEmployeeService employeeService = new EmployeeService();
	
	@Override
	public ModelAndView run() throws IOException {
		Employee employee = new Employee();
		employee.setId((int)request.get("id"));
		employee.setName((String)request.get("name"));
		employee.setAge((int)request.get("age"));
		employee.setWage((double)request.get("wage"));
		employee.setInductionTime((Timestamp)request.get("empInductionTime"));
		int i = employeeService.changeEmpById(employee);
		if(i > 0){
			mv.setViewName("changeSuccess");
		}else{
			mv.setViewName("changeFail");
		}
		
		return mv;
	}

}
