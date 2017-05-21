package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ChangeFailView extends AbstractView {

	private static final String CHANGE_FAIL_INFO = "ÐÞ¸ÄÊ§°Ü£¡";
	
	@Override
	public void render() throws IOException {
		Console.output(CHANGE_FAIL_INFO);
		request.put("command", "manage");
	}

}
