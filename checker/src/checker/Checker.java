/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checker;
import  java.sql.*;

/**
 *
 * @author Patrick
 */
public class Checker {
public static final String path = "jdbc:mysql://localhost:3306/invchecker";
public static final String user = "root";
public static final String pass = "Naiskongmagpakalasingdahilwalakana14";
static Connection con; 
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       try{
            con = DriverManager.getConnection(path , user , pass);
           System.out.println("Yay");
       }
       catch(Exception e){
           System.err.println("aw: " + e);
       } 
       
       index in = new index();
       in.setVisible(true);
       in.setLocationRelativeTo(null);




    }
    
}
