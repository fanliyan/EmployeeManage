package com.fly.Emp.ui.view;

import java.io.IOException;
import java.util.Map;

public abstract class AbstractView {

	protected Map<String, Object> request;
	protected Map<String, Object> model;
	public abstract void render() throws IOException;
	
	
	public void init(Map<String, Object> request){
		this.request = request;
	}


	public Map<String, Object> getRequest() {
		return request;
	}


	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	public Object getObject(String attributeName){
		if(model.containsKey(attributeName)){
			return model.get(attributeName);
		}
		return null;	
	}


	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
	
	
}
