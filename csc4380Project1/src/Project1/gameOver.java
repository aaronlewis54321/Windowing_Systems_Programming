/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1;

import javax.swing.SwingUtilities;

/**
 *
 * @author aaron
 */
public class gameOver extends javax.swing.JPanel {

    
    mainFrame topFrame;
    boolean isHighScore = false;
    boolean wasShown = false;
    
    /**
     * Creates new form gameOver
     */
    public gameOver() {
        initComponents();
        lblNewHighScore.setVisible(false);
        txtName.setVisible(false);
    }

    
    
    public int earnedAmount()
    {
        return 0;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlayAgain = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        lblTotalMoney = new javax.swing.JLabel();
        lblMonEarned = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblNewHighScore = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnPlayAgain.setText("Play again");
        btnPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayAgainActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        lblTotalMoney.setText("Total Money: $");

        lblMonEarned.setText("Money Earned: $");

        lblScore.setText("Score: ");

        lblNewHighScore.setText("Enter Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNewHighScore, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScore)
                            .addComponent(btnMainMenu)
                            .addComponent(btnPlayAgain)
                            .addComponent(lblTotalMoney)
                            .addComponent(lblMonEarned)))
                    .addComponent(txtName))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblNewHighScore, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblScore)
                .addGap(18, 18, 18)
                .addComponent(lblMonEarned)
                .addGap(18, 18, 18)
                .addComponent(lblTotalMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayAgain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMainMenu)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayAgainActionPerformed
        topFrame.newGame();
        GamePanel.currentScore = 0;
        topFrame.changeContext("game");
    }//GEN-LAST:event_btnPlayAgainActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        topFrame = (mainFrame) SwingUtilities.getWindowAncestor(this);
        lblScore.setText("Score: " + topFrame.getLastScore());
        lblMonEarned.setText("Money Earned: $" + topFrame.getLastScore());
        lblTotalMoney.setText("Total Money: $" + (topFrame.getMoney()+topFrame.getLastScore()));
        topFrame.setMoney(topFrame.getMoney() + topFrame.getLastScore());
        if(topFrame.getHighScores().isHighScore(topFrame.getLastScore()))
        {
             lblNewHighScore.setVisible(true);
             txtName.setVisible(true);
             isHighScore = true;
        }
        wasShown = true;
    }//GEN-LAST:event_formComponentShown

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
       topFrame.changeContext("main screen");
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        if(wasShown && isHighScore)
            topFrame.getHighScores().putNewHighScore(txtName.getText(), topFrame.getLastScore()+"");
        
        
        isHighScore = false;
        lblNewHighScore.setVisible(false);
        txtName.setText("");
        txtName.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_formComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnPlayAgain;
    private javax.swing.JLabel lblMonEarned;
    private javax.swing.JLabel lblNewHighScore;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTotalMoney;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
