/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeansproject;

/**
 *
 * created by Ngu Keh Cong (80369)
 * tested by Hana Saffiyya binti Ahmad Nozal (78013)
 */
import java.sql.SQLException;


public class Record implements dataOperation{
    protected double amount;
    protected double grandTotal;
    protected String query;
    protected int year;
    protected int month;
    protected int day;
    protected double typeAmount;
    
    
    @Override
    public void add() throws SQLException {
        query="INSERT INTO table_name(column1,...) VALUES (value1,...)";
    }
    
    @Override
    public void view() throws SQLException {
        query="SELECT * FROM table_name";
    }
    
    @Override
    public void edit() throws SQLException{
        query="UPDATE table_name SET column1=value1";
    }
    
    @Override
    public void delete() throws SQLException{
        query="DELETE FROM table_name WHERE condition";
    }
}
