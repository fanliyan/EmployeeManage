package com.fly.Emp.ui.view;

import java.io.IOException;
import java.util.List;

import com.fly.Emp.model.Employee;
import com.fly.Emp.utils.Console;

public class ViewEmpWageSuccessView extends AbstractView {

	private static final String VIEW_EMP_WAGE_TITLE = "���ݹ�Աid���ҹ��ʳɹ���";
	
	@SuppressWarnings("unchecked")
	@Override
	public void render() throws IOException {
      Console.output(VIEW_EMP_WAGE_TITLE);
      Console.output("id \t ����  \t ����");
      List<Employee> list = (List<Employee>)getObject("list");
      for(Employee employee: list){
    	 Console.output(employee.getId() + " \t " + employee.getName() + " \t "+ employee.getWage());
      }
        request.put("command", "manage");
	}

}
