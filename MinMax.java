/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package The_highest_profit_wins;

/**
 *
 * @author WINDOWS 10
 */
public class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan
        int[] array = {1, 2, 3, 4, 5};
        int[] result = minMax(array);
        System.out.println("Minimum: " + result[0] + ", Maximum: " + result[1]);
    }
}

