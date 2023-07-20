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
public class Question5 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Enter name of Student: ");
        String studentName = scanner1.nextLine();
        System.out.println("Enter student marks: ");
        int marks = Integer.parseInt(scanner1.nextLine());
        
        System.out.println("Student Name: " + studentName);
        
        if (marks >= 70 && marks <= 100){
            System.out.println("Student Grade: A");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("Student Grade: B");
        } else if(marks < 60 && marks >= 50) {
            System.out.println("Student Grade: C");
        } else if (marks < 50 && marks >= 40) {
            System.out.println("Student Grade: D");
        } else if (marks < 40 && marks >= 0) {
            System.out.println("Student Grade: F");
        } else {
            System.out.println("Invalid Marks!");
        }
    }
}
