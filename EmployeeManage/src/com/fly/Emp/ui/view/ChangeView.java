package com.fly.Emp.ui.view;

import java.io.IOException;
import java.sql.Timestamp;

import com.fly.Emp.utils.Console;

public class ChangeView extends AbstractView {
	private static final String CHANGE_EMP_INFO = "*****�޸Ĺ�Ա��Ϣ*****"; 
	
	@Override
	public void render() throws IOException {
		Console.output(CHANGE_EMP_INFO);
		Console.output("�������Աid��");
		int id = Integer.parseInt(Console.input());
		Console.output("�������޸ĺ������");
		String name = Console.input();
		Console.output("�������޸ĺ�����䣺");
		int age = Integer.parseInt(Console.input());
		Console.output("�������޸ĺ�Ĺ��ʣ�");
		double wage = Double.parseDouble(Console.input());
		Console.output("�������޸ĺ����ְʱ��(�磺2017-05-20 12:15:06)��");
		Timestamp empInductionTime = Timestamp.valueOf(Console.input());
		
		request.put("id", id);
		request.put("name", name);
		request.put("age", age);
		request.put("wage", wage);
		request.put("empInductionTime", empInductionTime);
		
		request.put("command", "changeEmp");
	}

}
