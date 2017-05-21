package com.fly.Emp.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fly.Emp.Dao.IEmployeeDao;
import com.fly.Emp.model.Employee;
import com.fly.Emp.utils.JdbcUtil;

public class EmployeeDao implements IEmployeeDao {

    @Override
	public int addEmp(Employee employee) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into emps(name, age, wage, inductiontime) value(?, ?, ?, ?)";
			pst = conn.prepareStatement(sql, new String[]{"id"});
			pst.setString(1, employee.getName());
			pst.setInt(2, employee.getAge());
			pst.setDouble(3, employee.getWage());
			pst.setTimestamp(4, employee.getInductionTime());
			pst.executeUpdate();
			rs = pst.getGeneratedKeys();
			if(rs.next()){
				return (rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.realease(conn, pst, rs);
		}
		return 0;
	}

	@Override
	public List<Employee> viewAllEmpWages(int page, int pageNumber) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Employee> list = new ArrayList<>();
		
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select name, wage from emps limit ?, ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, page * pageNumber - pageNumber);
			pst.setInt(2, pageNumber);
			rs = pst.executeQuery();
			while(rs.next()){
				Employee employee = new Employee();
				employee.setName(rs.getString(1));
				employee.setWage(rs.getDouble(2));
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int changeEmpById(Employee employee) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update emps set name = ?, age = ?, wage = ?, inductiontime = ? where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, employee.getName());
			pst.setInt(2, employee.getAge());
			pst.setDouble(3, employee.getWage());
			pst.setTimestamp(4, employee.getInductionTime());
			pst.setInt(5, employee.getId());
			int i = pst.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.realease(conn, pst, rs);
		}
		return 0;
	}

	@Override
	public int removeEmpById(int id) {

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from emps where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			int i = pst.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.realease(conn, pst, rs);
		}
	    
		return 0;
	}

	@Override
	public List<Employee> viewEmpById(int id) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Employee> list = new ArrayList<>();
		
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select id, name, wage from emps where id = ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while(rs.next()){
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setWage(rs.getDouble(3));
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JdbcUtil.realease(conn, pst, rs);
		}
		
		return list;
	}

}
