/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.sem1.hms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Achini & Samadhi
 */
public class DBConnection{
	private final Connection conn;
	private static DBConnection dbConnection;
	private DBConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost/RoomReservation","root","");
	}
	public static DBConnection getDBConnection()throws ClassNotFoundException,SQLException{
		if(dbConnection==null){
			dbConnection=new DBConnection();
                        System.out.println("Database Connect");
		}
		return dbConnection;
	}
	public Connection getConnection(){
		return conn;
	}
}


