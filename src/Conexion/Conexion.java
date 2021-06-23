/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para conectar a la base de datos MySQL
 * @author Christian
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/proyecto_subasta";
    public static final String USER = "root";
    public static final String PASSWORD = "12345678";
    private static Connection con;
     
    public static Connection getConnection(){
        if(con==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);

            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return con;
    }
}

