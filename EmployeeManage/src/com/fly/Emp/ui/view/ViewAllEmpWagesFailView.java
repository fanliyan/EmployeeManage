package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ViewAllEmpWagesFailView extends AbstractView {

	private static final String VIEW_ALL_EMP_FAIL_INFO = "�������й�Ա����ʧ��";
	
	@Override
	public void render() throws IOException {
		Console.output(VIEW_ALL_EMP_FAIL_INFO);
		request.put("command", "manage");
	}

}
