package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class AddEmpFailView extends AbstractView {

	private static final String ADD_EMP_FAIL_MESSAGE = "ÃÌº”πÕ‘± ß∞‹£°";
	
	@Override
	public void render() throws IOException {
       Console.output(ADD_EMP_FAIL_MESSAGE);
       request.put("command", "manage");
	}

}
