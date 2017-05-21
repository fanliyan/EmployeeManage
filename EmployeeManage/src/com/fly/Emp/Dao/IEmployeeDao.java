package com.fly.Emp.Dao;



import java.util.List;

import com.fly.Emp.model.Employee;

public interface IEmployeeDao {

	public int addEmp(Employee employee);
	
	public List<Employee> viewAllEmpWages(int page, int pageNumber);
	
	public int changeEmpById(Employee employee);
	
	public int removeEmpById(int id);
	
	public List<Employee> viewEmpById(int id);
}
