package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewofView extends AbstractView {

	private static final String VIEW_EMP_WAGE_TITLE = "*****����id��ѯ��Ա����*****";
	
	
	@Override
	public void render() throws IOException {
		Console.output(VIEW_EMP_WAGE_TITLE);
		Console.output("�������Աid��");
		int id = Integer.parseInt(Console.input());
		request.put("id", id);
		request.put("command", "viewEmpWage");
	}

}
