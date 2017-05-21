package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewEmpWageFailView extends AbstractView {

	private static final String VIEW_EMP_FAIL_INFO = "根据id查询雇员工资失败！";
	
	@Override
	public void render() throws IOException {
		Console.output(VIEW_EMP_FAIL_INFO);
		request.put("command", "manage");
	}

}
