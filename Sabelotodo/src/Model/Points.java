/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author JuanManuel
 */
public class Points {
    
    private String userName;
    private int userPoints;

    public Points(String userName, int userPoints) {
        this.userName = userName;
        this.userPoints = userPoints;
    }
    public Points(int userPoints) {
        this.userPoints = userPoints;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the userPoints
     */
    public int getUserPoints() {
        return userPoints;
    }

    /**
     * @param userPoints the userPoints to set
     */
    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }
}
