/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort_the_odd;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Arrays;

public class Kata2 {
    public static int[] sortArray(int[] array) {
        int[] oddNumbers = Arrays.stream(array)
                                 .filter(n -> n % 2 != 0)
                                 .sorted()
                                 .toArray();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[j++];
            }
        }

        return array;
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan
        int[] array = {5, 3, 2, 8, 1, 4};
        int[] result = sortArray(array);
        System.out.println("Sorted Array: " + Arrays.toString(result));
    }
}
