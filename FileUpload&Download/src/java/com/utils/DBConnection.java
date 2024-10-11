/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utils;

import com.config.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADM
 */
public class DBConnection implements Configuration{
    private static DBConnection instance;

    public DBConnection() {
    }
    
    public Connection openConnection() throws Exception{
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
    public static DBConnection getInstance() {
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;        
    }   
}
