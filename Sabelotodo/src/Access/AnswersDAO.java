/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access;

import Model.Answers;
import Utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanManuel
 */
public class AnswersDAO {

    public Answers getAnswers(int idQuestion) {
        Connection con = null;
        Answers answersSet = null;
        ArrayList<String> temp = new ArrayList<>();
        try {
            con = DBConnection.getConnection();
            String sql = " select answer, correct from answers where IdQuestion =? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idQuestion);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                temp.add(result.getString(1));
                temp.add(result.getString(2));
            }
            answersSet = new Answers(temp.get(0), temp.get(1), temp.get(2), temp.get(3), temp.get(4),
                    temp.get(5), temp.get(6), temp.get(7));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return answersSet;
    }
}
