package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class RemoveView extends AbstractView {

	private static final String REMOVE_EMP_TITLE = "*****ɾ����Ա��Ϣ******";
	

	@Override
	public void render() throws IOException {
		Console.output(REMOVE_EMP_TITLE);
		Console.output("������Ҫ�Ƴ��Ĺ�Ա��id��");
		int id = Integer.parseInt(Console.input());
		request.put("id", id);
		request.put("command", "removeEmp");
	}

}
