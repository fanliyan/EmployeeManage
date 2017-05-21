package com.fly.Emp.ui.controller;

import java.io.IOException;

import com.fly.Emp.model.ModelAndView;

/**
 * 
 * @author Fanliyan
 *
 */
public class ManageController extends AbstractController{

	@Override
	public ModelAndView run() throws IOException {
		mv.setViewName("manage");
		return mv;
	}
}
