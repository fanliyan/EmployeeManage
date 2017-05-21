package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class RemoveView extends AbstractView {

	private static final String REMOVE_EMP_TITLE = "*****删除雇员信息******";
	

	@Override
	public void render() throws IOException {
		Console.output(REMOVE_EMP_TITLE);
		Console.output("请输入要移除的雇员的id：");
		int id = Integer.parseInt(Console.input());
		request.put("id", id);
		request.put("command", "removeEmp");
	}

}
