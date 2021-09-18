/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanManuel
 */
public class QuestionsDAO {

    public String getQuestion(int idQuestion) {
        Connection con = null;
        String question = "";
        try {
            con = DBConnection.getConnection();
            String sql = " select question from questions where IdQuestion=? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idQuestion);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                question = result.getString(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return question;
    }
}
