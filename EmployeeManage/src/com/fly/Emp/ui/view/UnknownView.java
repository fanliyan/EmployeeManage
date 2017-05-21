package com.fly.Emp.ui.view;

import java.io.IOException;

import com.fly.Emp.utils.Console;

public class UnknownView extends AbstractView{

	@Override
	public void render() throws IOException {
		Console.output("请求页面不存在！");
		request.put("command", "manage");
	}

}
