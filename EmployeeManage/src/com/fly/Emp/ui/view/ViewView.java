package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewView extends AbstractView {

	private static final String VIEW_EMP_WAGES_TITLE = "*****查看所有用户员工工资*****";
	private static final String VIEW_EMP_WAGE_PAGE = "请输入查看第几页：";
	private static final String VIEW_EMP_PAGE_NUMBER = "请输入每页显示条数：";
	
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
