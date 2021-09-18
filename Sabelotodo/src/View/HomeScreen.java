/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JuanManuel
 */
public class HomeScreen implements ActionListener {

    public String user = "";
    JTextField userName;
    JFrame homeScreen;
    JButton rules;
    JButton btn1;
    JButton scoreBtn;

    public HomeScreen() {

        JLabel title = new JLabel();
        title.setText("SABELOTODO");
        title.setFont(new Font("Cooper Black", Font.PLAIN, 50));
        title.setForeground(new java.awt.Color(167, 203, 213));//color texto
        title.setBounds(25, 5, 370, 80);

        JLabel player = new JLabel();
        player.setText("Nombre");
        player.setFont(new Font("Kristen ITC", Font.BOLD, 20));
        player.setForeground(new java.awt.Color(247, 246, 240));//color texto
        player.setBounds(38, 252, 150, 25);

        btn1 = new JButton();
        btn1.setText("Empezar el juego");
        btn1.setFocusable(false);
        btn1.setFont(new Font("Kristen ITC", Font.BOLD, 13));
        btn1.setBackground(new java.awt.Color(167, 203, 213));
        btn1.setBounds(127, 300, 160, 40);
        btn1.addActionListener(this);

        userName = new JTextField();
        userName.setFont(new Font("Kristen ITC", Font.PLAIN, 15));
        userName.setBounds(127, 250, 223, 30);

        homeScreen = new JFrame();
        homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeScreen.setSize(420, 420);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = homeScreen.getSize();
        homeScreen.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        homeScreen.setLayout(null);
        homeScreen.setResizable(false);
        homeScreen.getContentPane().setBackground(new java.awt.Color(77, 76, 89));

        ImageIcon icon = new ImageIcon("src/View/logo.png");
        homeScreen.setIconImage(icon.getImage());
        homeScreen.setTitle("Sabelotodo");

        ImageIcon icon2 = new ImageIcon("src/View/rules.png");
        rules = new JButton();
        rules.setIcon(icon2);
        rules.setFocusable(false);
        rules.setBackground(new java.awt.Color(247, 246, 240));
        rules.setBounds(300, 300, 50, 40);
        rules.addActionListener(this);

        ImageIcon icon3 = new ImageIcon("src/View/score.png");
        scoreBtn = new JButton();
        scoreBtn.setIcon(icon3);
        scoreBtn.setFocusable(false);
        scoreBtn.setBackground(new java.awt.Color(167, 203, 213));
        scoreBtn.setBounds(320, 100, 60, 50);
        scoreBtn.addActionListener(this);

        JLabel image = new JLabel();
        image.setIcon(icon);
        image.setBounds(135, 80, 200, 160);

        homeScreen.add(title);
        homeScreen.add(userName);
        homeScreen.add(player);
        homeScreen.add(image);
        homeScreen.add(btn1);
        homeScreen.add(rules);
        homeScreen.add(scoreBtn);
        homeScreen.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            Rules rl = new Rules();
        }
        if (ae.getSource() == btn1) {
            Game g1 = new Game();
            g1.setUser(userName.getText());
            homeScreen.dispose();
        }
        if (ae.getSource() == scoreBtn) {
            Scores sc1 = new Scores();
            homeScreen.dispose();
        }
    }
}
