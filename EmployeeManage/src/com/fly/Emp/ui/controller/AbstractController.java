package com.fly.Emp.ui.controller;

import java.io.IOException;
import java.util.Map;

import com.fly.Emp.model.ModelAndView;

public abstract class AbstractController {

	protected Map<String, Object> request;
	protected ModelAndView mv = new ModelAndView();
	public abstract ModelAndView run() throws IOException;
	
	public void init(Map<String, Object> request){
		this.request = request;
	}
}
