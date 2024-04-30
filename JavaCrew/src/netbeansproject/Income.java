/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package netbeansproject;

import java.sql.SQLException;

/**
 *
 * created by Ngu Keh Cong (80369)
 * tested by Muhammad Hanif Fadhil bin Zakaria (78245)
 */
public class Income extends Record{
    
    private int incomeID;
    private String incomeName;
    private String incomeType;
    
    public Income(){}
    
    public Income(database d,String s1) throws SQLException{
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
        
        addIncome addinc=new addIncome();
        addinc.setVisible(true);
    }
    
    @Override
    public void view() throws SQLException {
        ViewAndDeleteIncome viewAndDel=new ViewAndDeleteIncome();
        viewAndDel.setVisible(true);
    }
    
    @Override
    public void edit() throws SQLException{
        editIncome editinc=new editIncome();
        editinc.setVisible(true);
    }
    
    public void delete() throws SQLException {
        ViewAndDeleteIncome viewAndDel=new ViewAndDeleteIncome();
        viewAndDel.setVisible(true);
    }
}
