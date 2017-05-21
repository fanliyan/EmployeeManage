package com.fly.Emp.ui.view;

import java.io.IOException;
import java.sql.Timestamp;

import com.fly.Emp.utils.Console;

public class AddEmpView extends AbstractView{

	private static final String ADD_EMP_PAGE_TITLE = "*****添加雇员信息*****";
	private static final String ADD_EMP_NAME_LABEL = "请输入雇员姓名：";
	private static final String ADD_EMP_AGE_LABEL = "请输入雇员年龄：";
	private static final String ADD_EMP_WAGE_LABEL = "请输入雇员工资：";
	private static final String ADD_EMP_INDUCTION_TIME = "请输入雇员入职时间（如：2017-05-20 12:15:06）";
	
	
	@Override
	public void render() throws IOException {
	   Console.output(ADD_EMP_PAGE_TITLE);
	   Console.output(ADD_EMP_NAME_LABEL);
	   String empName = Console.input();
	   Console.output(ADD_EMP_AGE_LABEL);
	   int empAge = Integer.parseInt(Console.input());
	   Console.output(ADD_EMP_WAGE_LABEL);
	   double empWage = Double.parseDouble(Console.input());
	   Console.output(ADD_EMP_INDUCTION_TIME);
	   Timestamp empInductionTime = Timestamp.valueOf(Console.input());
	   request.put("empName", empName);
	   request.put("empAge", empAge);
	   request.put("empWage", empWage);
	   request.put("empInductionTime", empInductionTime);
	   
	   request.put("command", "addEmp");
	}

}
