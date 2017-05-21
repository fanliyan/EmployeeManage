package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class RemoveSuccessView extends AbstractView{

	private static final String REMOVE_EMP_SUCCESS_INFO = "ÒÆ³ý¹ÍÔ± ³É¹¦£¡";
	
	@Override
	public void render() throws IOException {
		 Console.output(REMOVE_EMP_SUCCESS_INFO);
		 request.put("command", "manage");
	}

}
