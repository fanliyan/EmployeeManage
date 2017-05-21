package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ManageView extends AbstractView {
	
	private static final String MANAGE_PAGE_TITLE = "******欢迎进入雇员管理系统******";
	private static final String OPERATION_TYPE_LABEL = "请选择你要进行的操作";
	private static final String VIEW_WAGES_LABEL = "view \t 查看雇员工资";
	private static final String VIEW_WAGE_BY_ID_LABEL ="viewof \t 根据雇员id查询雇员工资";
	private static final String ADD_EMPLOYEE_LABEL = "add \t 添加雇员信息";
	private static final String CHANGE_EMPLOYEE_LABEL = "change \t 修改雇员信息";
	private static final String REMOVE_EMPLOYEE_LABEL = "remove \t 删除雇员";
	private static final String EXIT_SYSTEM_LABEL = "exit \t 退出系统";
	
	
	@Override
	public void render() throws IOException {
		Console.output(MANAGE_PAGE_TITLE);
		Console.output(OPERATION_TYPE_LABEL);
		Console.output(VIEW_WAGES_LABEL);
		Console.output(VIEW_WAGE_BY_ID_LABEL);
		Console.output(ADD_EMPLOYEE_LABEL);
		Console.output(CHANGE_EMPLOYEE_LABEL);
		Console.output(REMOVE_EMPLOYEE_LABEL);
		Console.output(EXIT_SYSTEM_LABEL);
		
		String commandString = Console.input();
		request.put("command", commandString);
	}

}
