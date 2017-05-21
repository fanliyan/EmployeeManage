package com.fly.Emp.ui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fly.Emp.model.ModelAndView;
import com.fly.Emp.ui.controller.AbstractController;
import com.fly.Emp.ui.controller.UnknownController;
import com.fly.Emp.ui.view.AbstractView;
import com.fly.Emp.ui.view.UnknownView;

/**
 * Ç°¶Ë¿ØÖÆÆ÷
 * @author ·¶Á¢Ñ×
 *
 */
public class FrontController {

	public static void main(String[] args) throws IOException {
       Map<String, Object> request = new HashMap<>();
       request.put("command", "manage");
       while(true){
	       AbstractController command = getCommand((String)request.get("command"));
	       command.init(request);
	       ModelAndView mv =  command.run();
	       AbstractView view = getView(mv.getViewName());
	       view.init(request);
	       render(view, mv.getModel());
       }
	}
	
	private static void render(AbstractView view, Map<String, Object> model) throws IOException{
		view.setModel(model);
		view.render();
	}
	
	private static AbstractController getCommand(String command){
		try {
			return (AbstractController)getCommandClass(command).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	private static AbstractView getView(String viewName){
		
		try{
			return (AbstractView)getViewNameClass(viewName).newInstance();
		}catch(Exception e){
			throw new RuntimeException();
		}
		
	}
	
	private static Class<?> getCommandClass(String command){
		Class<?> result;
		 final String packageName = "com.fly.Emp.ui.controller.";
		 final String commandClassName = packageName + command.substring(0, 1).toUpperCase() + command.substring(1) + "Controller";
		 try {
			result = Class.forName(commandClassName);
		} catch (ClassNotFoundException e) {
		     result = UnknownController.class;
		}
		 return result;
	}
	
	private static Class<?> getViewNameClass(String viewName){
		Class<?> result;
		final String packageName = "com.fly.Emp.ui.view.";
		final String viewClassName = packageName + viewName.substring(0, 1).toUpperCase() + viewName.substring(1) + "View";
		try {
			result = Class.forName(viewClassName);
		} catch (ClassNotFoundException e) {
		    result = UnknownView.class;
		}
		return result;
	}

}
