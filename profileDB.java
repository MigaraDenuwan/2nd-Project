package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class profileDB {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<user> validate(String username, String password) {
		
		ArrayList <user> us = new ArrayList<>();
		
		//validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from profile where username ='"+username+"' and password='"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name1 = rs.getString(2);
				String name2 = rs.getString(3);
				String Email = rs.getString(4);
				String phone = rs.getString(5);
				String userU = rs.getString(6);
				String passU = rs.getString(7);
				
				user c = new user(id,name1,name2,Email,phone,userU,passU);
				us.add(c);
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return us;
	}
	public static boolean userinsertservlet(String fname, String lname, String email, String phone, String uname, String passw) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into profile values(0,'"+fname+"','"+lname+"','"+email+"','"+phone+"','"+uname+"','"+passw+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	public static boolean updateuserservrlet(String id, String fName, String lName, String email, String phone, String uername, String password)
	{
			try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update profile set fName='"+fName+"', lName = '"+lName+"', email = '"+email+"', phone = '"+phone+"', username = '"+uername+"', password = '"+password+"'"
						  +"where id = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	public static List<user> getUserdetails(String id) { 
		
		int Convertedid = Integer.parseInt(id);
		
		ArrayList<user> us = new ArrayList<>();
		
			try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "select * from profile where id = '"+Convertedid+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String fName = rs.getString(2);
				String lName = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				
				user u = new user(id1, fName, lName, email, phone, username, password);
				us.add(u);
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
			return us;
	}
	public static boolean deleteUser(String id) {
		
		int convertedid = Integer.parseInt(id);
		

		try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		
		String sql = "delete from profile where id = '"+convertedid+"'";
		
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		}
		
		catch(Exception e){
		
		e.printStackTrace();
	}
		
		return isSuccess;
	}
}
