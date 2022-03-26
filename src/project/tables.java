/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhupal Prajapati
 */
public class tables {
    public static void main(String[] args)
    {
      Connection con=null;
        Statement st = null;    
        try
      {
       
      con = ConnectionProvider.getcon();
      st=con.createStatement();
      st.executeUpdate("create table customer(id int, name varchar(200), mobileNumber varchar(20), nationality varchar(200), gender varchar(50), email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(50), roomNo varchar(10), bed varchar(200), roomType varchar(200), pricePerDay int(10), numberOfDaysStay int(10), totalAmount varchar(200), checkout varchar(50))");
      st.execute("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20)) ");
      st.executeUpdate("create table customer(id int, name varchar(200), mobileNumber varchar(20), nationality varchar(200), gender varchar(50), email varchar(200), idProof varchar(200), address varchar(500), checkIn varchar(50), roomNo varchar(10), bed varchar(200), roomType varchar(200), pricePerDay int(10), numberOfDaysStay int(10), totalAmount varchar(200), checkout varchar(50))");
         JOptionPane.showMessageDialog(null,"Table Created Successfully");        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {}
        }
    }
}
     
        
    

