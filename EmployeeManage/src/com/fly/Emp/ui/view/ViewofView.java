package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewofView extends AbstractView {

	private static final String VIEW_EMP_WAGE_TITLE = "*****根据id查询雇员工资*****";
	
	
	@Override
	public void render() throws IOException {
		Console.output(VIEW_EMP_WAGE_TITLE);
		Console.output("请输入雇员id：");
		int id = Integer.parseInt(Console.input());
		request.put("id", id);
		request.put("command", "viewEmpWage");
	}

}
