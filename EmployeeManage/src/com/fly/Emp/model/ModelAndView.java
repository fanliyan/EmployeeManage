package com.fly.Emp.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装模型数据和逻辑视图名称
 * @author Fanliyan
 *
 */
public class ModelAndView {
		
	    private Map<String, Object> model = new HashMap<>();
		private String viewName;
		
		
		public Map<String, Object> getModel() {
			return model;
		}
		
		public void addObject(String attributeName, Object attributeValue){
			model.put(attributeName, attributeValue);
		}
		
		public String getViewName() {
			return viewName;
		}
		public void setViewName(String viewName) {
			this.viewName = viewName;
		}
}
