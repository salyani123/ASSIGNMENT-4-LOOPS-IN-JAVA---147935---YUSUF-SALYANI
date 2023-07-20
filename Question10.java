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
public class Question10 {
    public static void main(String[] args) {
        
        Scanner scanner1 = new Scanner(System.in);
        int sum = 0, num;
       
        do {
            System.out.print("Enter an integer (Enter 0 to exit): ");
            num = scanner1.nextInt();
            sum += num;
        } while (num != 0);
        
        System.out.println("Sum of integers = " + sum);
    }
}
