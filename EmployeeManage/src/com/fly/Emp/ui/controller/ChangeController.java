package com.fly.Emp.ui.controller;

import java.io.IOException;

import com.fly.Emp.model.ModelAndView;

public class ChangeController extends AbstractController {

	
	@Override
	public ModelAndView run() throws IOException {
		mv.setViewName("change");
		return mv;
	}

}
