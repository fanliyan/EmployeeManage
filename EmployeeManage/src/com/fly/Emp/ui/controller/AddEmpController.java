package com.fly.Emp.ui.controller;

import java.io.IOException;
import java.sql.Timestamp;

import com.fly.Emp.model.Employee;
import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.service.IEmployeeService;
import com.fly.Emp.service.impl.EmployeeService;

public class AddEmpController extends AbstractController {

	private IEmployeeService employeeService = new EmployeeService();
		
	@Override
	public ModelAndView run() throws IOException {
		Employee employee = new Employee();
		employee.setName((String)request.get("empName"));
		employee.setAge((int)request.get("empAge"));
		employee.setWage((double)request.get("empWage"));
		employee.setInductionTime((Timestamp)request.get("empInductionTime"));
		int i = employeeService.addEmp(employee);
		if(i > 0){
			mv.setViewName("addEmpSuccess");
		}else{
			mv.setViewName("addEmpFail");
		}
		return mv;
	}
}
