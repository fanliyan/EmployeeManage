package com.fly.Emp.ui.controller;

import java.io.IOException;

import com.fly.Emp.model.ModelAndView;

public class ExitController extends AbstractController {

	@Override
	public ModelAndView run() throws IOException {
		System.exit(0);
		return null;
	}

}
