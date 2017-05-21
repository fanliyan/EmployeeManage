package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class ChangeSuccessView extends AbstractView {

	private static final String CHANGE_SUCCESS_INFO = "ÐÞ¸Ä³É¹¦£¡";
	
	@Override
	public void render() throws IOException {
		Console.output(CHANGE_SUCCESS_INFO);
		request.put("command", "manage");
	}

}
