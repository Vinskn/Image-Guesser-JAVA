/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageguesser;

public class Score {
    private String username;
    private int nilai;
    
    Score(String username, int nilai){
        this.username = username;
        this.nilai = nilai;
    }
    
    String getUsername(){
        return username;
    }
    
    int getNilai(){
        return nilai;
    }
}
