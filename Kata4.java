/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Highest_Scoring_Word;

/**
 *
 * @author WINDOWS 10
 */
public class Kata4 {
    public static String high(String s) {
        String[] words = s.split(" ");
        int highestScore = 0;
        String highestScoringWord = "";
        
        for (String word : words) {
            int score = getWordScore(word);
            if (score > highestScore) {
                highestScore = score;
                highestScoringWord = word;
            }
        }
        
        return highestScoringWord;
    }
    
    private static int getWordScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += c - 'a' + 1;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud")); // Output: taxi
        System.out.println(high("what time are we climbing up to the volcano")); // Output: volcano
        System.out.println(high("take me to semynak")); // Output: semynak
    }
}