/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

/**
 *
 * @author Yusuf Salyani
 */
public class Question12 {
    public static void main(String[] args) {
        int count = 1, sum = 0;
        
        while(count < 50) {
            sum = sum + count;
            count+=2;
        }
        
        System.out.println("Sum of odd numbers between 0 and 50: " + sum);
    }
}
