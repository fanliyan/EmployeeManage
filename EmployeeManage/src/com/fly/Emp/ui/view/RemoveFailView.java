package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class RemoveFailView extends AbstractView {

	private static final String REMOVE_EMP_FAIL_INFO = "�Ƴ���Ա�ɹ���";
	
	@Override
	public void render() throws IOException {
       Console.output(REMOVE_EMP_FAIL_INFO);
       request.put("command", "manage");
	}

}
