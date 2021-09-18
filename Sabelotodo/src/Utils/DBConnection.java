/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanManuel
 */
public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(Properties.dbURL, Properties.username, Properties.password);
            if (con != null) {
                System.out.println("Conectado a la base de datos");
                return con;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
            ex.printStackTrace();
        }
        return con;
    }
}
