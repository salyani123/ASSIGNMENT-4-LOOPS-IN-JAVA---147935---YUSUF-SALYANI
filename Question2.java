/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

/**
 *
 * @author Yusuf Salyani
 */
public class Question2 {
    public static void main(String[] args) {
        // Unlabeled break statement
        System.out.println("Unlabeled Break Statement:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            if (i == 3) {
                break; // Exits the loop when i is 3
            }
        }
        System.out.println("\n");

        // Labeled break statement
        System.out.println("Labeled Break Statement:");
        outerLoop: // Labeling the outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop iteration: " + j);
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
            }
        }
    }
}
