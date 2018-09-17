/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.sem1.hms.controller;

import edu.ijse.sem1.hms.db.DBConnection;
import edu.ijse.sem1.hms.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Achini & Samadhi
 */
public class UserController {
    
    public static boolean addUser(User user) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO User VALUES(?,?,?,?, password(?))";
        PreparedStatement stm = DBConnection.getDBConnection().getConnection().prepareStatement(query);
        stm.setObject(1, user.getUserid());
        stm.setObject(2, user.getFirstname());
        stm.setObject(3, user.getLastname());
        stm.setObject(4, user.getUsername());
        stm.setObject(5, user.getPassword());
        int res=stm.executeUpdate();
        return res>0;
    }
    
      public static boolean  login(String user,String password) throws SQLException, ClassNotFoundException {
        boolean login = false;
        String query = "SELECT * FROM roomreservation.user where user_name=? and password=?;";

        PreparedStatement stm = DBConnection.getDBConnection().getConnection().prepareStatement(query);
        stm.setObject(1, user);
        stm.setObject(2, password);
        System.out.println(user);
        System.out.println(password);
        stm.executeQuery();
        ResultSet rs = stm.executeQuery();
        if(rs.next()){
        
        String checkUser = rs.getString("user_name");
        String checkPass = rs.getString("password");
        System.out.println(checkUser);
        System.out.println(checkPass);
        
        if((checkUser.equals(user)) && (checkPass.equals(password)))
        {
            login = true;
        }
        else
        {
            login = false;
        }
        }

        return login;
    }
}



