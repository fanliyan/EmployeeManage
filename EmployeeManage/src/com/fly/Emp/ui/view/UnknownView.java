package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class UnknownView extends AbstractView{

	@Override
	public void render() throws IOException {
		Console.output("����ҳ�治���ڣ�");
		request.put("command", "manage");
	}

}
