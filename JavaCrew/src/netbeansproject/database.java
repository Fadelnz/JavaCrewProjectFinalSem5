/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeansproject;

/**
 *
 * created by Ngu Keh Cong (80369)
 * tested by Nurshahira binti Nabi (80800)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class database {
    private static final String url="jdbc:mysql://localhost:3306/budgetplanner";
    private static final String username="root";
    private static final String password="";
    //String query="select * from student";
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Connection getConnection() {
        return connection;
    }

    public PreparedStatement getStatement() {
        return statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
        }

        catch(SQLException e) {
            throw new RuntimeException(e);
        }

        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void setStatement(String query) throws SQLException {
        statement= connection.prepareStatement(query);
    }
    
    public void executeQ() throws SQLException{
       resultSet=statement.executeQuery();
    };
    

    public void insert() throws SQLException {
        int rowsInserted=statement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"Added successfully");
        }
        statement.close();
    }

    public void modify()throws SQLException{
        int rowsInserted=statement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"Updated successfully");
        }
        statement.close();
    }

    public void delete()throws SQLException{
        int rowsInserted=statement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"Deleted successfully");
        }
        statement.close();
    }

    public void disconnect() throws SQLException {
        connection.close();
    }
}
