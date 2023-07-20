/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

/**
 *
 * @author Yusuf Salyani
 */
public class Question8 {
    public static void main(String[] args) {
        int count = 12;
        
        do {
            if (count < 50){
                System.out.print(count + ", ");
            } else {
                System.out.print(count + ".");
            }
            count+=2;
        } while (count <= 50);
    }
}
