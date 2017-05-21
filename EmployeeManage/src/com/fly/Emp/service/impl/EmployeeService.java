package com.fly.Emp.service.impl;

import java.util.List;

import com.fly.Emp.Dao.IEmployeeDao;
import com.fly.Emp.Dao.impl.EmployeeDao;
import com.fly.Emp.model.Employee;
import com.fly.Emp.service.IEmployeeService;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao = new EmployeeDao();
	
	@Override
	public int addEmp(Employee employee) {
		int i = employeeDao.addEmp(employee);
		return i;
	}
	
	@Override
	public List<Employee> viewAllEmpWages(int page, int pageNumber){
		List<Employee> list = employeeDao.viewAllEmpWages(page, pageNumber);
		return list;
	}

	@Override
	public int changeEmpById(Employee employee) {
      int i = employeeDao.changeEmpById(employee);
		return i;
	}

	@Override
	public int removeEmpById(int id) {
		int i = employeeDao.removeEmpById(id);
		return i;
	}

	@Override
	public List<Employee> viewEmpWageById(int id) {
		List<Employee> list = employeeDao.viewEmpById(id);
		return list;
	}
}
