package com.fly.Emp.ui.controller;

import java.io.IOException;
import java.util.List;

import com.fly.Emp.model.Employee;
import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.service.IEmployeeService;
import com.fly.Emp.service.impl.EmployeeService;

public class ViewEmpWageController extends AbstractController {

	private IEmployeeService employeeService = new EmployeeService();
	
	@Override
	public ModelAndView run() throws IOException {
		List<Employee> list = employeeService.viewEmpWageById((int)request.get("id"));
		if(list !=null && !list.isEmpty()){
			mv.addObject("list", list);
			mv.setViewName("viewEmpWageSuccess");
		}else{
			mv.setViewName("viewEmpWageFail");
		}
		return mv;
	}

}
