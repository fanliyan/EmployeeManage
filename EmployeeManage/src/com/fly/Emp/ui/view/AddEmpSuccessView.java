package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class AddEmpSuccessView extends AbstractView {

	private static final String ADD_EMP_SUCCESS_MESSAGE = "��ӹ�Ա�ɹ�!"; 
	
	@Override
	public void render() throws IOException {
			Console.output(ADD_EMP_SUCCESS_MESSAGE);
			request.put("command", "manage");
	}

}
