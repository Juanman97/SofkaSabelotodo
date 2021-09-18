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
public class Answers {

    private String answer1;
    private String a1correct;
    private String answer2;
    private String a2correct;
    private String answer3;
    private String a3correct;
    private String answer4;
    private String a4correct;

    public Answers(String answer1, String a1correct, String answer2, String a2correct, String answer3, String a3correct, String answer4, String a4correct) {
        this.answer1 = answer1;
        this.a1correct = a1correct;
        this.answer2 = answer2;
        this.a2correct = a2correct;
        this.answer3 = answer3;
        this.a3correct = a3correct;
        this.answer4 = answer4;
        this.a4correct = a4correct;
    }

    /**
     * @return the answer1
     */
    public String getAnswer1() {
        return answer1;
    }

    /**
     * @return the a1correct
     */
    public String getA1correct() {
        return a1correct;
    }

    /**
     * @return the answer2
     */
    public String getAnswer2() {
        return answer2;
    }

    /**
     * @return the a2correct
     */
    public String getA2correct() {
        return a2correct;
    }

    /**
     * @return the answer3
     */
    public String getAnswer3() {
        return answer3;
    }

    /**
     * @return the a3correct
     */
    public String getA3correct() {
        return a3correct;
    }

    /**
     * @return the answer4
     */
    public String getAnswer4() {
        return answer4;
    }

    /**
     * @return the a4correct
     */
    public String getA4correct() {
        return a4correct;
    }
}
