/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * created by Ngu Keh Cong (80369)
 * tested by Muhammad Hanif Fadhil bin Zakaria (78245)
 */
package netbeansproject;

import java.sql.SQLException;

public class Expense extends Record{
    private int expenseID;
    private String expenseName;
    private String expenseType;
    
    public Expense(){}
    public Expense(database d,String s1) throws SQLException{
       if(s1.equals("add")){
           add();
       }
       
       if(s1.equals("view")){
           view();
       }
       
       if(s1.equals("delete")){
           delete();
       }
       
       if(s1.equals("edit")){
           edit();
       }
       
        
    }
    @Override
    public void add() throws SQLException {
        
        addExpenses addexp=new addExpenses();
        addexp.setVisible(true);
    }

    @Override
    public void edit() throws SQLException {
        editExpenses editexp=new editExpenses();
        editexp.setVisible(true);
    }

    @Override
    public void view() throws SQLException {
          viewAndDeleteExpenses viewexp= new viewAndDeleteExpenses();
          viewexp.setVisible(true);
    }

    @Override
    public void delete() throws SQLException{
          viewAndDeleteExpenses viewexp= new viewAndDeleteExpenses();
          viewexp.setVisible(true);
    }
}
