/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Access.AnswersDAO;
import Access.PointsDAO;
import Access.QuestionsDAO;
import Model.Answers;
import Model.Points;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static sabelotodo.Sabelotodo.randomNumber;

/**
 *
 * @author JuanManuel
 */
public class Game extends javax.swing.JFrame {

    QuestionsDAO qdao = null;
    AnswersDAO adao = null;
    PointsDAO pdao = null;
    int roundCount = 1;
    int pointsCount = 0;
    String user = "";
    boolean aCorrect;
    boolean bCorrect;
    boolean cCorrect;
    boolean dCorrect;

    /**
     * Creates new form GraphicInterface
     */
    public Game() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        this.setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new java.awt.Color(77, 76, 89));
        this.setVisible(true);
        ImageIcon icon = new ImageIcon("src/View/logo.png");
        this.setIconImage(icon.getImage());
        this.setTitle("Sabelotodo");

        JLabel image = new JLabel();
        image.setIcon(icon);
        image.setBounds(80, 340, 290, 250);

        this.add(image);

        title.setForeground(new java.awt.Color(167, 203, 213));
        category.setForeground(new java.awt.Color(167, 203, 213));
        category.setBounds(20, 100, 180, 60);

        pointsCounter.setForeground(new java.awt.Color(167, 203, 213));
        pointsCounter.setBounds(450, 100, 350, 60);

        questionText.setBounds(20, 180, 745, 85);
        questionText.setLineWrap(true);
        questionText.setWrapStyleWord(true);
        questionText.setFont(new Font("Kristen ITC", Font.PLAIN, 20));
        questionText.setForeground(new java.awt.Color(77, 76, 89));

        optionA.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        optionA.setForeground(new java.awt.Color(167, 203, 213));
        optionA.setBounds(350, 300, 500, 60);

        optionB.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        optionB.setForeground(new java.awt.Color(167, 203, 213));
        optionB.setBounds(350, 400, 500, 60);

        optionC.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        optionC.setForeground(new java.awt.Color(167, 203, 213));
        optionC.setBounds(350, 500, 500, 60);

        optionD.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        optionD.setForeground(new java.awt.Color(167, 203, 213));
        optionD.setBounds(350, 600, 500, 60);

        ABtn.setFocusable(false);
        ABtn.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        ABtn.setForeground(new java.awt.Color(77, 76, 89));
        ABtn.setBackground(new java.awt.Color(167, 203, 213));
        ABtn.setBounds(270, 300, 60, 60);

        BBtn.setFocusable(false);
        BBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        BBtn.setForeground(new java.awt.Color(77, 76, 89));
        BBtn.setBackground(new java.awt.Color(167, 203, 213));
        BBtn.setBounds(270, 400, 60, 60);

        CBtn.setFocusable(false);
        CBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        CBtn.setForeground(new java.awt.Color(77, 76, 89));
        CBtn.setBackground(new java.awt.Color(167, 203, 213));
        CBtn.setBounds(270, 500, 60, 60);

        DBtn.setFocusable(false);
        DBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        DBtn.setForeground(new java.awt.Color(77, 76, 89));
        DBtn.setBackground(new java.awt.Color(167, 203, 213));
        DBtn.setBounds(270, 600, 60, 60);

        exitBtn.setFocusable(false);
        exitBtn.setFont(new Font("Kristen ITC", Font.BOLD, 30));
        exitBtn.setForeground(new java.awt.Color(77, 76, 89));
        exitBtn.setBackground(new java.awt.Color(167, 203, 213));
        exitBtn.setBounds(580, 700, 180, 50);

        setQuestionAndOptions();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        questionText = new javax.swing.JTextArea();
        optionA = new javax.swing.JLabel();
        optionB = new javax.swing.JLabel();
        optionD = new javax.swing.JLabel();
        optionC = new javax.swing.JLabel();
        ABtn = new javax.swing.JButton();
        BBtn = new javax.swing.JButton();
        CBtn = new javax.swing.JButton();
        DBtn = new javax.swing.JButton();
        pointsCounter = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        title.setFont(new java.awt.Font("Cooper Black", 0, 50)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("SABELOTODO");
        title.setToolTipText("");

        category.setFont(new java.awt.Font("Kristen ITC", 1, 40)); // NOI18N
        category.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        category.setText("Nivel 1");

        questionText.setEditable(false);
        questionText.setColumns(20);
        questionText.setRows(5);

        ABtn.setText("A");
        ABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABtnActionPerformed(evt);
            }
        });

        BBtn.setText("B");
        BBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBtnActionPerformed(evt);
            }
        });

        CBtn.setText("C");
        CBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBtnActionPerformed(evt);
            }
        });

        DBtn.setText("D");
        DBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBtnActionPerformed(evt);
            }
        });

        pointsCounter.setFont(new java.awt.Font("Kristen ITC", 1, 40)); // NOI18N
        pointsCounter.setText("jLabel1");

        exitBtn.setText("Rendirse");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(category)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pointsCounter)
                        .addGap(154, 154, 154))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(optionD, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addComponent(optionC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ABtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optionA, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBtn)
                                    .addComponent(BBtn))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn)
                                .addGap(13, 13, 13)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointsCounter))
                .addGap(18, 18, 18)
                .addComponent(questionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optionA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ABtn))
                .addGap(31, 31, 31)
                .addComponent(BBtn)
                .addGap(1, 1, 1)
                .addComponent(optionB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(CBtn)
                .addGap(2, 2, 2)
                .addComponent(optionC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DBtn)
                    .addComponent(exitBtn))
                .addGap(6, 6, 6)
                .addComponent(optionD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABtnActionPerformed
        // TODO add your handling code here:
        if (roundCount != 5) {
            if (aCorrect == true) {
                pointsCount += 100;
                roundCount++;
                JOptionPane.showMessageDialog(null, "Respuesta Correcta! Has sumado 100 puntos.");
                setQuestionAndOptions();
            } else {
                if (pointsCount >= 100) {
                    pointsCount -= 100;
                }
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        } else {
            if (aCorrect == true) {
                pointsCount += 100;
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado!. Tu puntuación es " + pointsCount + ". El juego ha terminado c:");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                roundCount = 1;
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            } else {
                pointsCount -= 100;
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        }
    }//GEN-LAST:event_ABtnActionPerformed

    private void BBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBtnActionPerformed
        // TODO add your handling code here:
        if (roundCount != 5) {
            if (bCorrect == true) {
                pointsCount += 100;
                roundCount++;
                JOptionPane.showMessageDialog(null, "Respuesta Correcta! Has sumado 100 puntos.");
                setQuestionAndOptions();
            } else {
                if (pointsCount >= 100) {
                    pointsCount -= 100;
                }
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        } else {
            if (bCorrect == true) {
                pointsCount += 100;
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado!. Tu puntuación es " + pointsCount + ". El juego ha terminado c:");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                roundCount = 1;
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            } else {
                pointsCount -= 100;
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        }
    }//GEN-LAST:event_BBtnActionPerformed

    private void CBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBtnActionPerformed
        // TODO add your handling code here:
        if (roundCount != 5) {
            if (cCorrect == true) {
                pointsCount += 100;
                roundCount++;
                JOptionPane.showMessageDialog(null, "Respuesta Correcta! Has sumado 100 puntos.");
                setQuestionAndOptions();
            } else {
                if (pointsCount >= 100) {
                    pointsCount -= 100;
                }
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        } else {
            if (cCorrect == true) {
                pointsCount += 100;
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado!. Tu puntuación es " + pointsCount + ". El juego ha terminado c:");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                roundCount = 1;
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            } else {
                pointsCount -= 100;
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        }
    }//GEN-LAST:event_CBtnActionPerformed

    private void DBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBtnActionPerformed
        // TODO add your handling code here:
        if (roundCount != 5) {
            if (dCorrect == true) {
                pointsCount += 100;
                roundCount++;
                JOptionPane.showMessageDialog(null, "Respuesta Correcta! Has sumado 100 puntos.");
                setQuestionAndOptions();
            } else {
                if (pointsCount >= 100) {
                    pointsCount -= 100;
                }
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        } else {
            if (dCorrect == true) {
                pointsCount += 100;
                JOptionPane.showMessageDialog(null, "Felicidades, has ganado!. Tu puntuación es " + pointsCount + ". El juego ha terminado c:");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                roundCount = 1;
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            } else {
                pointsCount -= 100;
                roundCount = 1;
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta. Tu puntuación es " + pointsCount + ". El juego ha terminado :c");
                pdao = new PointsDAO();
                if (!user.equals("")) {
                    Points newPlayer = new Points(user, pointsCount);
                    pdao.addPointComplete(newPlayer);
                } else {
                    Points newPlayer = new Points(pointsCount);
                    pdao.addPointIncomplete(newPlayer);
                }
                pointsCount = 0;
                Scores sc = new Scores();
                this.dispose();
            }
        }
    }//GEN-LAST:event_DBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Te has rendido. Tu puntuación es " + pointsCount + ". El juego ha terminado.");
        pdao = new PointsDAO();
        if (!user.equals("")) {
            Points newPlayer = new Points(user, pointsCount);
            pdao.addPointComplete(newPlayer);
        } else {
            Points newPlayer = new Points(pointsCount);
            pdao.addPointIncomplete(newPlayer);
        }
        roundCount = 1;
        pointsCount = 0;
        Scores sc = new Scores();
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    public void setUser(String user) {
        this.user = user;
    }

    public void setQuestionAndOptions() {
        aCorrect = false;
        bCorrect = false;
        cCorrect = false;
        dCorrect = false;
        category.setText("Nivel " + roundCount);
        pointsCounter.setText("Puntos: " + pointsCount);
        int level = randomNumber();
        level += 5 * (roundCount - 1);
        qdao = new QuestionsDAO();
        questionText.setText("\n  " + qdao.getQuestion(level));
        adao = new AnswersDAO();
        Answers ans = adao.getAnswers(level);
        String A = ans.getAnswer1();
        String B = ans.getAnswer2();
        String C = ans.getAnswer3();
        String D = ans.getAnswer4();
        if (ans.getA1correct().equals("si")) {
            aCorrect = true;
        } else if (ans.getA2correct().equals("si")) {
            bCorrect = true;
        } else if (ans.getA3correct().equals("si")) {
            cCorrect = true;
        } else {
            dCorrect = true;
        }
        optionA.setText(A);
        optionB.setText(B);
        optionC.setText(C);
        optionD.setText(D);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABtn;
    private javax.swing.JButton BBtn;
    private javax.swing.JButton CBtn;
    private javax.swing.JButton DBtn;
    private javax.swing.JLabel category;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel optionA;
    private javax.swing.JLabel optionB;
    private javax.swing.JLabel optionC;
    private javax.swing.JLabel optionD;
    private javax.swing.JLabel pointsCounter;
    private javax.swing.JTextArea questionText;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
