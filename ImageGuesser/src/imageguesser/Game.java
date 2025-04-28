/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package imageguesser;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class Game extends javax.swing.JFrame {
    String user;
    int lifePoint = 3;
    int noSoal = 0;
    int gameScore = 0;
    Soal[] daftarSoal;
    
    public Game(String user) {
        initComponents();
        setResizable(false); 
        setSize(800, 600); 
        setLocationRelativeTo(null);
        gameUser.setText(user);
        life.setText(String.valueOf(lifePoint));
        this.user = user;
        
        
        daftarSoal = new Soal[]{
            new Soal(1, "Sapi Kepala Ayam", new ImageIcon(getClass().getResource("/imageguesser/gambar/AyamKakiEmpat.jpeg"))),
            new Soal(2, "Monyet", new ImageIcon(getClass().getResource("/imageguesser/gambar/Monyet.jpeg"))),
            new Soal(3, "Kuda Kepala Angsa", new ImageIcon(getClass().getResource("/imageguesser/gambar/Kuda Kepala Angsa.jpeg"))),
            new Soal(4, "Kucing Kepala Ayam", new ImageIcon(getClass().getResource("/imageguesser/gambar/Kucing Kepala Ayam.jpeg"))),
            new Soal(5, "Kucing Kaki Dua", new ImageIcon(getClass().getResource("/imageguesser/gambar/Kucing Kaki Dua.jpeg"))),
            new Soal(6, "Kelinci Kaki Dua", new ImageIcon(getClass().getResource("/imageguesser/gambar/Kelinci Kaki Dua.jpeg"))),
            new Soal(7, "Kucing Berenang", new ImageIcon(getClass().getResource("/imageguesser/gambar/Kucing Berenang.jpeg"))),
            new Soal(8, "Hiu Kaki Empat", new ImageIcon(getClass().getResource("/imageguesser/gambar/Hiu Kaki Empat.jpeg"))),
            new Soal(9, "Burung Kepala Kucing", new ImageIcon(getClass().getResource("/imageguesser/gambar/Burung Kepala Kucing.jpeg"))),
            new Soal(10, "Angsa Kaki Empat", new ImageIcon(getClass().getResource("/imageguesser/gambar/Angsa Kaki Empat.jpeg"))),
        };

        
        tampilkanSoal();
        
        ImageIcon nyawa = new ImageIcon(getClass().getResource("/imageguesser/gambar/Nyawa.png"));
        Image image = nyawa.getImage();
        Image resize = image.getScaledInstance(hati.getWidth(), hati.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizeIcon = new ImageIcon(resize);
        hati.setIcon(resizeIcon);
        
        ImageIcon back = new ImageIcon(getClass().getResource("/imageguesser/gambar/iconback.png"));
        Image backImage = back.getImage();
        Image resizeBack = backImage.getScaledInstance(tombolBack.getWidth(), tombolBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resize2 = new ImageIcon(resizeBack);
        tombolBack.setIcon(resize2);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        hati = new javax.swing.JLabel();
        life = new javax.swing.JLabel();
        skor = new javax.swing.JLabel();
        gameUser = new javax.swing.JLabel();
        areaGambar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jawaban = new javax.swing.JTextField();
        tombolBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tebak Gambar");
        jLabel1.setAlignmentX(250.0F);
        jLabel1.setAlignmentY(150.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(300, 40));

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Masukan Jawaban");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        submitBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitBtnKeyPressed(evt);
            }
        });

        life.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        life.setForeground(new java.awt.Color(255, 255, 255));
        life.setText("3");
        life.setAlignmentX(250.0F);
        life.setAlignmentY(150.0F);
        life.setMaximumSize(new java.awt.Dimension(300, 40));

        skor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        skor.setText("Skor: 0");

        gameUser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        gameUser.setForeground(new java.awt.Color(255, 255, 255));
        gameUser.setText("Username");
        gameUser.setAlignmentX(250.0F);
        gameUser.setAlignmentY(150.0F);
        gameUser.setMaximumSize(new java.awt.Dimension(300, 40));

        jawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanActionPerformed(evt);
            }
        });
        jawaban.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jawabanKeyPressed(evt);
            }
        });

        tombolBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tombolBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(hati, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 269, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(skor)
                        .addGap(413, 413, 413))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(areaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tombolBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skor))
                            .addComponent(hati, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(areaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void submitBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitBtnKeyPressed

    }//GEN-LAST:event_submitBtnKeyPressed

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        if (lifePoint > 1) {
            if (gameScore != 10) {
                if (jawaban.getText().equalsIgnoreCase(daftarSoal[noSoal].getJawaban())) {
                    noSoal++;
                    gameScore++; 
                    
                    if(gameScore == 10){
                        JOptionPane.showMessageDialog(rootPane, "Menang");
                        Leaderboard.addScore(user, gameScore);
                        new menuUtama(user).setVisible(true);
                        this.dispose();
                        return;
                    }
                    
                    ImageIcon icon = new ImageIcon(getClass().getResource("/imageguesser/gambar/Benar.png"));
                    JOptionPane.showMessageDialog(rootPane, "", "BENAR!", JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    skor.setText("Skor : " + String.valueOf(gameScore));
                    tampilkanSoal();
                } else {
                    lifePoint--;
                    
                    ImageIcon icon = new ImageIcon(getClass().getResource("/imageguesser/gambar/Salah.png"));
                    JOptionPane.showMessageDialog(rootPane, "", "SALAH!", JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    life.setText(String.valueOf(lifePoint));
                }
            } 
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nyawa Habis");
            Leaderboard.addScore(user, gameScore);
            new menuUtama(user).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitBtnMouseClicked

    private void jawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawabanActionPerformed

    private void tombolBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolBackMouseClicked
        new menuUtama(user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tombolBackMouseClicked

    private void jawabanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jawabanKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            submitBtnMouseClicked(null);
        }
    }//GEN-LAST:event_jawabanKeyPressed

    
    
    private void tampilkanSoal(){
        areaGambar.setIcon(daftarSoal[noSoal].getGambar());
        areaGambar.setHorizontalAlignment(SwingConstants.CENTER);
        areaGambar.setVerticalAlignment(SwingConstants.CENTER);
        jawaban.setText("");
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaGambar;
    private javax.swing.JLabel gameUser;
    private javax.swing.JLabel hati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jawaban;
    private javax.swing.JLabel life;
    private javax.swing.JLabel skor;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel tombolBack;
    // End of variables declaration//GEN-END:variables
}
