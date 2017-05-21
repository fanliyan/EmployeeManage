package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewView extends AbstractView {

	private static final String VIEW_EMP_WAGES_TITLE = "*****�鿴�����û�Ա������*****";
	private static final String VIEW_EMP_WAGE_PAGE = "������鿴�ڼ�ҳ��";
	private static final String VIEW_EMP_PAGE_NUMBER = "������ÿҳ��ʾ������";
	
	@Override
	public void render() throws IOException {
        Console.output(VIEW_EMP_WAGES_TITLE);
        Console.output(VIEW_EMP_WAGE_PAGE);
        int page = Integer.parseInt(Console.input());
        Console.output(VIEW_EMP_PAGE_NUMBER);
        int pageNumber = Integer.parseInt(Console.input());
        
        request.put("page", page);
        request.put("pageNumber", pageNumber);
        
        request.put("command", "viewAllEmpWages");
	}

}
