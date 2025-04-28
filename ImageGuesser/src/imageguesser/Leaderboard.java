/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imageguesser;


public class Leaderboard {
    private static Score[] listScore = new Score[5];
    private static int jml = 0;
    
    public static void addScore(String username, int nilai){
        if (jml < listScore.length) {
            listScore[jml] = new Score(username, nilai);
            jml++;
        }
    }
    
    public static Score[] getListScore(){
        return listScore;
    }
    
    public static void sorting(){
        for (int i = 0; i < jml - 1; i++) {
            for (int j = 0; j < jml - i - 1; j++) {
                if (listScore[j].getNilai() < listScore[j + 1].getNilai()) {
                    Score temp = listScore[j];
                    listScore[j] = listScore[j + 1];
                    listScore[j + 1] = temp;
                }
            }
        }
    }
}
