/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystemrev.backend;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author lozan
 */
public class JDBController {
    
    //private ArrayList<String> user_list;
    
    private String username;
    private final String dbURL = "jdbc:derby://localhost:1527/norsu";
    private final String serverName = "lozanasc";
    private final String serverPass = "sean";
    
    public boolean isOnline(){
    try {
        Connection conn = DriverManager.getConnection(dbURL, serverName, serverPass);
        Statement stat = conn.createStatement();
        String testsql = "";
        stat.executeUpdate(testsql);
        return true;
        }
       catch(SQLException ex){ 
       return false;
    }
    }
    
    public String toggleChoice(javax.swing.JToggleButton btn1,javax.swing.JToggleButton btn2,javax.swing.JToggleButton btn3){
        if(btn1.isSelected())
            return "TEACHER";
        else if (btn2.isSelected())
            return "STUDENT";
        else if (btn3.isSelected())
            return "PARENT";
        else
            return null;
    }
    //Function that makes sure the toggle button is only pressed once but this is rather spaghetti
    public boolean toggleError(javax.swing.JToggleButton btn1,javax.swing.JToggleButton btn2,javax.swing.JToggleButton btn3){
    return !(btn1.isSelected() && btn2.isSelected() 
                || btn2.isSelected() && btn3.isSelected()
                || btn3.isSelected() && btn1.isSelected()
                || btn1.isSelected() && btn2.isSelected() && btn3.isSelected());
    }
    
    //Function that inserts data to the database
    public void toCreate(String Table, String usn,String addr,String fulln, String pass){
  try {
                Connection conn = DriverManager.getConnection(dbURL, serverName, serverPass);
                Statement stat = conn.createStatement();
                String insertsql = "INSERT INTO "+Table+ 
                " VALUES ('"+usn+"','"+fulln+"','"+addr+"','"+pass+"')";
                stat.executeUpdate(insertsql);
            }
       catch(SQLException ex){ 
       System.out.println(ex);
    }
    }
    
    //Function that verifies your inputted account
    public boolean AccountVerification(String Usern, String Passw, String Table){
       try{
       Connection conn = DriverManager.getConnection(dbURL, serverName, serverPass);
       Statement stat = conn.createStatement();
        String sql = "SELECT * FROM "+Table+" WHERE username='"+Usern+"'AND password='"+Passw+"'";
       ResultSet rs = stat.executeQuery(sql);  
           return rs.next();
       }
       catch(SQLException ex){ 
       System.out.println(ex);
      return false;
    }
       }
}
