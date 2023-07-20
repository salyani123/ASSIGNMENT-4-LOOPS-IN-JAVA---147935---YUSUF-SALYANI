/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

import java.util.Scanner;

/**
 *
 * @author Yusuf Salyani
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner1.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner1.nextInt();

        int max;

        switch (/*If num1 is greater than num2, return 1*/num1 > num2 ? 1 : /*If num1 is less than num2, returns 2*/num1 < num2 ? 2 : /*If num1 and num2 are equal, return 0*/0) {
            case 1:
                max = num1;
                break;
            case 2:
                max = num2;
                break;
            default:
                System.out.println("Both numbers are equal.");
                return;
        }

        System.out.println("The maximum number is: " + max);
        scanner1.close();
    }
    
}
