/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Highest_and_Lowest;

/**
 *
 * @author WINDOWS 10
 */
public class Kata1 {
    public static String highAndLow(String numbers) {
        String[] nums = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String num : nums) {
            int n = Integer.parseInt(num);
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        return max + " " + min;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        String numbers = "2 4 3 7 9 0";
        System.out.println(highAndLow(numbers)); // Output: "9 0"
    }
}
