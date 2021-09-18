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
import javax.swing.JTextArea;

/**
 *
 * @author JuanManuel
 */
public class Rules implements ActionListener {

    JButton backbtn;
    JFrame rules;

    public Rules() {

        JLabel title = new JLabel();
        title.setText("Reglas");
        title.setFont(new Font("Cooper Black", Font.PLAIN, 40));
        title.setForeground(new java.awt.Color(167, 203, 213));
        title.setBounds(135, 5, 370, 80);

        JTextArea text = new JTextArea();
        text.setText("Este juego consta de 5 rondas de preguntas, cada una con un nivel"
                + " de dificultad diferente (muy fácil, fácil, intermedio, difícil, muy difícil)."
                + " Cada ronda tiene una pregunta del nivel de dificultad correspondiente"
                + " y con 4 opciones de respuesta, con una única respuesta correcta. Si el jugador responde"
                + " correctamente, ganará 100 puntos y avanzará hasta la siguiente ronda; si el jugador responde"
                + " incorrectamente, perderá 100 puntos y terminará el juego. Si el jugador termina el juego "
                + "voluntariamente, terminará con los puntos que tenga hasta el momento sin ninguna penalización.");
        text.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        text.setForeground(new java.awt.Color(247, 246, 240));
        text.setBounds(20, 80, 380, 250);
        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        text.setBackground(new java.awt.Color(77, 76, 89));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);

        backbtn = new JButton();
        backbtn.setText("Regresar");
        backbtn.setFocusable(false);
        backbtn.setFont(new Font("Kristen ITC", Font.BOLD, 15));
        backbtn.setBackground(new java.awt.Color(167, 203, 213));
        backbtn.setBounds(142, 330, 120, 30);
        backbtn.addActionListener(this);

        rules = new JFrame();
        rules.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rules.setUndecorated(true);
        rules.setSize(420, 420);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = rules.getSize();
        rules.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        rules.setLayout(null);
        rules.setResizable(false);
        rules.getContentPane().setBackground(new java.awt.Color(77, 76, 89));

        ImageIcon icon = new ImageIcon("src/View/logo.png");
        rules.setIconImage(icon.getImage());
        rules.setTitle("Reglas de Sabelotodo");

        rules.add(title);
        rules.add(text);
        rules.add(backbtn);
        rules.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backbtn) {
            rules.dispose();
        }
    }
}
