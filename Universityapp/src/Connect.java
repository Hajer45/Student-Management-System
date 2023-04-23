/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 21654
 */
import java.sql.*;
public class Connect {
    Connection con;
    public Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
            System.err.println(e);   
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:5506/university?","root","7102");
        }catch(SQLException e){
            System.err.println(e);
        }
        
    }  
    Connection getConnection(){
        return con;
    }
    
}
