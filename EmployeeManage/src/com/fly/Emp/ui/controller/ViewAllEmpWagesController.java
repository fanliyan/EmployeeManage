package com.fly.Emp.ui.controller;

import java.io.IOException;
import java.util.List;

import com.fly.Emp.model.Employee;
import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.service.IEmployeeService;
import com.fly.Emp.service.impl.EmployeeService;

public class ViewAllEmpWagesController extends AbstractController {
	private IEmployeeService employeeService = new EmployeeService();
	
	@Override
	public ModelAndView run() throws IOException {
		List<Employee> list = employeeService.viewAllEmpWages((int)request.get("page"), (int)request.get("pageNumber"));
		
		if(list != null && !list.isEmpty()){
			mv.addObject("list", list);
			mv.setViewName("viewAllEmpWagesSuccess");
		}else{
			mv.setViewName("viewAllEMpWagesFail");
		}
		return mv;
	}

}
