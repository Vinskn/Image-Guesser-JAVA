/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageguesser;

import javax.swing.ImageIcon;

/**
 *
 * @author Svin
 */
public class Soal {
    private ImageIcon gambar;
    private String jawaban;
    private int key;
    
    Soal(int key, String jawaban, ImageIcon gambar) {
        this.key = key;
        this.jawaban = jawaban;
        this.gambar = gambar;
    }
    
    public ImageIcon getGambar(){
        return gambar;
    }
    
    public int getKey(){
        return key;
    }
    
    public String getJawaban() {
        return jawaban;
    }
}
