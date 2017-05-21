package com.fly.Emp.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JdbcUtil {
	
	private static Connection conn;
	
	private static String driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;
	
	static{
		InputStream in = JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties");
		Properties pro = new Properties();
		try {
			pro.load(in);
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			user = pro.getProperty("user");
			password = pro.getProperty("password");
			Class.forName(driver);
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static Connection getConnection() throws SQLException{
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public static void realease(Connection conn, Statement st, ResultSet rs){
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if(st != null){
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			st = null;
		}
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public static List query(String sql, int columnCount, Object... objects) throws SQLException{
		List list = new ArrayList();
		PreparedStatement pst = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){
			for(int i = 0; i < objects.length; i++){
				pst.setObject(i + 1, objects[i]);
			}
		}
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			Object[] array = new Object[columnCount];
			for(int i = 0; i < columnCount; i++){
				array[i] = rs.getObject(i+1);
			}
			list.add(array);
		}
		if(rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if(pst != null){
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pst = null;
		}
		return list;
	}
	
	public static int update(String sql, Object... objects) throws SQLException{
		PreparedStatement pst = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){
			for(int i = 0; i < objects.length; i++){
				pst.setObject(i + 1, objects[i]);
			}
		}
		int i = pst.executeUpdate();
		if(pst != null){
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pst = null;
		}
		return i;
	}
	
	
	
	public static int insert(String sql, Object ...objects) throws SQLException{
		PreparedStatement pst = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){
			for(int i = 0; i < objects.length; i++){
				pst.setObject(i + 1, objects[i]);
			}
		}
		int i = pst.executeUpdate();
		if(pst != null){
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pst = null;
		}
		return i;
	}
	
	public static int delete(String sql, Object ...objects) throws SQLException{
		PreparedStatement pst = conn.prepareStatement(sql);
		if(objects != null && objects.length > 0){
			for(int i = 0; i < objects.length; i++){
				pst.setObject(i + 1, objects[i]);
			}
		}
		int i = pst.executeUpdate();
		if(pst != null){
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			pst = null;
		}
		return i;
	}
}
