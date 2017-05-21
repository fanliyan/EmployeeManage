package com.fly.Emp.ui.view;

import java.io.IOException;
import java.util.List;

import com.fly.Emp.model.Employee;
import com.fly.Emp.utils.Console;

public class ViewAllEmpWagesSuccessView extends AbstractView {

	private static final String VIEW_ALL_EMP_SUCESS_INFO = "�������й�Ա���ʳɹ���";
	private static final String VIEW_ALL_EMP_WAGES_COL_TITLE = "����  \t ����"; 
	
	@SuppressWarnings("unchecked")
	@Override
	public void render() throws IOException {
		Console.output(VIEW_ALL_EMP_SUCESS_INFO);
		List<Employee> list = (List<Employee>)getObject("list");
		Console.output(VIEW_ALL_EMP_WAGES_COL_TITLE);
		for(Employee employee: list){
			Console.output(employee.getName() + " \t " + employee.getWage());
		}
		request.put("command", "manage");
	}

}
