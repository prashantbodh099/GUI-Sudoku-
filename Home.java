  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;
import java.awt.Color;
import javax.swing.*;
import Sudoku.Avg_Game;
import Sudoku.Easy_Game;
import Sudoku.Dif_Game;
/**
 *
 * @author prashant
 */
public class Home extends javax.swing.JFrame {
    /**
     * Creates new form Home
     */
    public Home() {
       
        initComponents();
    }
    JFrame frame  = new JFrame();
   // frame.getContentPane().setBackground(Color.BLUE);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPlayer = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        JExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUDOKU");
        setBackground(new java.awt.Color(255, 0, 51));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/prashant/NetBeansProjects/Sudoku/dd.png")); // NOI18N

        jPlay.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jPlay.setText("Play Now");
        jPlay.setOpaque(true);
        jPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 195, 54));
        jLabel2.setText("Player Name");

        jPlayer.setBackground(new java.awt.Color(255, 162, 6));
        jPlayer.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jPlayer.setForeground(new java.awt.Color(241, 37, 28));
        jPlayer.setToolTipText("");
        jPlayer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPlayer.setName(""); // NOI18N
        jPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayerActionPerformed(evt);
            }
        });
        jPlayer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPlayerKeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 140, 0));
        jRadioButton1.setText("Beginner");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 140, 0));
        jRadioButton3.setText("Pro");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 140, 0));
        jRadioButton4.setText("Medium");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 215, 0));
        jLabel3.setText("Level");

        JExit.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        JExit.setText("Exit");
        JExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(JExit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String Player;
    int level = 0;
    JFrame fram = new JFrame();
    JFrame framw = new JFrame();
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        level = 1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        level = 2;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        level = 3;
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    
    private void JExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JExitActionPerformed
        if(JOptionPane.showConfirmDialog(frame,"Confirm Exit","Sudoku",JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_NO_OPTION)){
            System.exit(0);
        }
    }//GEN-LAST:event_JExitActionPerformed
        
    private void jPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayActionPerformed
        Player = jPlayer.getText();
        if(jPlayer.getText().isBlank()){
            JOptionPane.showMessageDialog(framw,"Write your name","wait wait wait!!!",JOptionPane.ERROR_MESSAGE);
        }
        else {
        switch (level) {
            case 1:
                dispose();
                Easy_Game beginner = new Easy_Game(Player);
                beginner.setVisible(true);
                break;
            case 2:
             //   dispose();
                setVisible(false);
                Avg_Game average = new Avg_Game(Player); 
                average.setVisible(true);
                break;
            case 3:
                dispose();
                Dif_Game pro = new Dif_Game(Player);
                pro.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(fram,"Please select level","wait wait wait",JOptionPane.ERROR_MESSAGE);
                break;
        }
        }
    }//GEN-LAST:event_jPlayActionPerformed

    private void jPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayerActionPerformed
       
    }//GEN-LAST:event_jPlayerActionPerformed

    private void jPlayerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPlayerKeyPressed
            if(jPlayer.getText().length() > 14) {
                 jPlayer.setEditable(false);
                 }  
            if(evt.getKeyCode() == 8) {
                jPlayer.setEditable(true);
            }

    }//GEN-LAST:event_jPlayerKeyPressed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jPlay;
    private javax.swing.JTextField jPlayer;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

}
