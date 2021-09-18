/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabelotodo;

import View.HomeScreen;

/**
 *
 * @author JuanManuel
 */
public class Sabelotodo {

    public static int randomNumber(){
        int num = (int)((Math.random()*5)+1);
        return num;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeScreen hs = new HomeScreen();
    }
}
