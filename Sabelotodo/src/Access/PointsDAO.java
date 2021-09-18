/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Model.Points;
import Utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanManuel
 */
public class PointsDAO {

    public ArrayList<Points> getPoints() {
        Connection con = null;
        ArrayList<Points> pointsSet = new ArrayList<>();
        try {
            con = DBConnection.getConnection();
            String sql = " select userName, userPoints from points order by userPoints desc ";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                Points newP = new Points(result.getString(1), result.getInt(2));
                pointsSet.add(newP);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return pointsSet;
    }

    public void addPointComplete(Points p) {
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            String sql = " insert points(userName, userPoints) values (?,?) ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, p.getUserName());
            statement.setInt(2, p.getUserPoints());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Nueva puntuación agregada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

    public void addPointIncomplete(Points p) {
        Connection con = null;
        try {
            con = DBConnection.getConnection();
            String sql = " insert points(userPoints) values (?) ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, p.getUserPoints());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Nueva puntuación agregada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
}
