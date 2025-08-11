package com.knot.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBConnectivity {
	private String url="jdbc:mysql://127.0.0.1:3306/product";
	private String user="root";
	private String password = "root";
	
	public void insertEmployees(List<Employee> employee) {
    	String insertSQL="INSERT INTO employee_details(id,name,l_name,age,emp_designation,gender,dob,blood_group) VALUES (?,?,?,?,?,?,?,?) ";
    	
    	try(Connection conn= DriverManager.getConnection(url, user, password);
    			PreparedStatement pstmt=conn.prepareStatement(insertSQL);){
    		for (Employee emp:employee) {
    			pstmt.setInt(1,1);
        		pstmt.setString(2, "Paramesh");
        		pstmt.setString(3, "Raghava");
        		pstmt.setInt(4, 5000);
        		pstmt.setString(5, "Associate Trainee");
        		pstmt.setString(6, "Male");
        		pstmt.setString(7, "2000-05-07");
        		pstmt.setString(8, "B+ve");
    		}
    		int rows=pstmt.executeUpdate();
    		System.out.println(rows + "Rows inserted");
     		   		
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}  	
	}
}
