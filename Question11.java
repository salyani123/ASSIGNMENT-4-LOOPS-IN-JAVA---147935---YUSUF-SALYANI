/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopassignment4;

/**
 *
 * @author Yusuf Salyani
 */
public class Question11 {
    
    
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return false;
        }
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++){
            if (n % i == 0) {
                return false;
            }
        }
  
        return true;
    }
  
    public static void main(String[] args) {
        
        int count = 0;
    
        while (count <= 100) {
            if (isPrime(count)) {
                if (count < 100){
                    System.out.print(count + ", ");
                } else {
                    System.out.print(count + ".");
                }
            }
            count++;
        }
    }
}
