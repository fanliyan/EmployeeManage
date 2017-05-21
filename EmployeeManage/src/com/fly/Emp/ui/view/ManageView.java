package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ManageView extends AbstractView {
	
	private static final String MANAGE_PAGE_TITLE = "******��ӭ�����Ա����ϵͳ******";
	private static final String OPERATION_TYPE_LABEL = "��ѡ����Ҫ���еĲ���";
	private static final String VIEW_WAGES_LABEL = "view \t �鿴��Ա����";
	private static final String VIEW_WAGE_BY_ID_LABEL ="viewof \t ���ݹ�Աid��ѯ��Ա����";
	private static final String ADD_EMPLOYEE_LABEL = "add \t ��ӹ�Ա��Ϣ";
	private static final String CHANGE_EMPLOYEE_LABEL = "change \t �޸Ĺ�Ա��Ϣ";
	private static final String REMOVE_EMPLOYEE_LABEL = "remove \t ɾ����Ա";
	private static final String EXIT_SYSTEM_LABEL = "exit \t �˳�ϵͳ";
	
	
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
