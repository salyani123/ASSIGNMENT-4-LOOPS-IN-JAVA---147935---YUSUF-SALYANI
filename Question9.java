/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

/**
 *
 * @author Yusuf Salyani
 */
public class Question9 {
    public static void main(String[] args) {
        int sum = 0, count = 20;
        
        do {
            sum = sum + count; 
            count++;
        } while (count < 26);
        
        System.out.println("Sum of integers from 20 to 25: " + sum);
    }
}
