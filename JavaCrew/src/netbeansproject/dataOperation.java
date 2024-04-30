/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package netbeansproject;

/**
 *
 * created by Ngu Keh Cong (80369)
 * tested by Hana Saffiyya binti Ahmad Nozal (78013)
 */
import java.sql.SQLException;

public interface dataOperation {
    public void add() throws SQLException;
    public void view() throws SQLException;
    public void edit() throws SQLException;
    public void delete() throws SQLException;
}


