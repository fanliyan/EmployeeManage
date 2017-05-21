package com.fly.Emp.ui.controller;

import java.io.IOException;

import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.service.IEmployeeService;
import com.fly.Emp.service.impl.EmployeeService;

public class RemoveEmpController extends AbstractController {

	private IEmployeeService employeeService = new EmployeeService();
	
	@Override
	public ModelAndView run() throws IOException {
		int i = employeeService.removeEmpById((int)request.get("id"));
		if(i > 0){
			mv.setViewName("removeSuccess");
		}else{
			mv.setViewName("removeFail");
		}
		return mv;
	}

}
