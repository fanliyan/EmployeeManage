package com.fly.Emp.ui.view;

import java.io.IOException;
import java.sql.Timestamp;

import com.fly.Emp.utils.Console;

public class ChangeView extends AbstractView {
	private static final String CHANGE_EMP_INFO = "*****修改雇员信息*****"; 
	
	@Override
	public void render() throws IOException {
		Console.output(CHANGE_EMP_INFO);
		Console.output("请输入雇员id：");
		int id = Integer.parseInt(Console.input());
		Console.output("请输入修改后的姓名");
		String name = Console.input();
		Console.output("请输入修改后的年龄：");
		int age = Integer.parseInt(Console.input());
		Console.output("请输入修改后的工资：");
		double wage = Double.parseDouble(Console.input());
		Console.output("请输入修改后的入职时间(如：2017-05-20 12:15:06)：");
		Timestamp empInductionTime = Timestamp.valueOf(Console.input());
		
		request.put("id", id);
		request.put("name", name);
		request.put("age", age);
		request.put("wage", wage);
		request.put("empInductionTime", empInductionTime);
		
		request.put("command", "changeEmp");
	}

}
