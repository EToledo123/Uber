/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.expocode.android.mygps;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conect {  
    public static Connection getConexion() {
        Connection connection = null;
        
        try {
            String driverClassName = "oracle.jdbc.driver.OracleDriver";
            String driverUrl="jdbc:oracle:thin:@https://github.com/EToledo123/Uber.git:1521:XE";
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, "EToledo123","tcf12345");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}