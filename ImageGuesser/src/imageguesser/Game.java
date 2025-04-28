/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package imageguesser;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class Game extends javax.swing.JFrame {
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
        
        daftarSoal = new Soal[]{
            new Soal(1, "Ayam Bakar", new ImageIcon(getClass().getResource("/imageguesser/gambar/AyamKakiEmpat.jpeg"))),
            new Soal(2, "Ayam Goreng", new ImageIcon("tes.png")),
            new Soal(3, "Ayam Enak", new ImageIcon("tes.png")),
        };
        
        tampilkanSoal();
        
        ImageIcon nyawa = new ImageIcon(getClass().getResource("/imageguesser/gambar/Nyawa.png"));
        Image image = nyawa.getImage();
        Image resize = image.getScaledInstance(hati.getWidth(), hati.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizeIcon = new ImageIcon(resize);
        hati.setIcon(resizeIcon);
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jawaban = new javax.swing.JTextArea();
        areaGambar = new javax.swing.JLabel();

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

        jawaban.setColumns(1);
        jawaban.setRows(1);
        jScrollPane2.setViewportView(jawaban);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(skor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(areaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(291, 291, 291))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(life, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hati, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(life, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hati, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(skor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areaGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                skor.setText("Skor : " + String.valueOf(gameScore));
                tampilkanSoal();
            } else {
                lifePoint--;
                life.setText(String.valueOf(lifePoint));
            }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Menang");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nyawa Habis");
            new registerForm().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_submitBtnMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jawaban;
    private javax.swing.JLabel life;
    private javax.swing.JLabel skor;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
