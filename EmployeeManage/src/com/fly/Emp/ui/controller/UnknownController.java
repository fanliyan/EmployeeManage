package com.fly.Emp.ui.controller;

import java.io.IOException;

import com.fly.Emp.model.ModelAndView;

public class UnknownController extends AbstractController{

	@Override
	public ModelAndView run() throws IOException {
		mv.setViewName("unknownCommand");
		return mv;
	}
   
}
