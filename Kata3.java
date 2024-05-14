/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Get_the_Middle_Character;

/**
 *
 * @author WINDOWS 10
 */
public class Kata3 {
    public static String getMiddle(String str) {
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            // Jika panjang kata genap, kembalikan 2 karakter tengah
            return str.substring(middleIndex - 1, middleIndex + 1);
        } else {
            // Jika panjang kata ganjil, kembalikan karakter tengah
            return str.substring(middleIndex, middleIndex + 1);
        }
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan
        System.out.println(getMiddle("test")); // Output: "es"
        System.out.println(getMiddle("testing")); // Output: "t"
        System.out.println(getMiddle("middle")); // Output: "dd"
        System.out.println(getMiddle("A")); // Output: "A"
    }
}
