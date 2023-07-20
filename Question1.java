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


public class Question1 {
    //method that claculates grade given the marks
    private static String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        //creates scanner object
        Scanner scanner1 = new Scanner(System.in);
        //Promts user for name
        System.out.println("Enter student name: ");
        String stdName = scanner1.nextLine();
        //prompts user for subject and marks
        System.out.println("Enter name of subject: ");
        String subjectA = scanner1.nextLine();
        System.out.println("Enter subject marks: ");
        double subjectAMks = Double.parseDouble(scanner1.nextLine());
        //calculate subject grade using subject marks
        String subjectAGrd = calculateGrade(subjectAMks);
        
        System.out.println("Enter name of subject: ");
        String subjectB = scanner1.nextLine();
        System.out.println("Enter subject marks: ");
        double subjectBMks = Double.parseDouble(scanner1.nextLine());
        String subjectBGrd = calculateGrade(subjectBMks);
        
        System.out.println("Enter name of subject: ");
        String subjectC = scanner1.nextLine();
        System.out.println("Enter subject marks: ");
        double subjectCMks = Double.parseDouble(scanner1.nextLine());
        String subjectCGrd = calculateGrade(subjectCMks);
        
        System.out.println("Enter name of subject: ");
        String subjectD = scanner1.nextLine();
        System.out.println("Enter subject marks: ");
        double subjectDMks = Double.parseDouble(scanner1.nextLine());
        String subjectDGrd = calculateGrade(subjectDMks);
        
        System.out.println("Enter name of subject: ");
        String subjectE = scanner1.nextLine();
        System.out.println("Enter subject marks: ");
        double subjectEMks = Double.parseDouble(scanner1.nextLine());
        String subjectEGrd = calculateGrade(subjectEMks);
        //prints students name and marks
        System.out.println("Name of Student: " + stdName);
        System.out.println(subjectA + ": " + subjectAMks + ", " + subjectAGrd);
        System.out.println(subjectB + ": " + subjectBMks + ", " + subjectBGrd);
        System.out.println(subjectC + ": " + subjectCMks + ", " + subjectCGrd);
        System.out.println(subjectD + ": " + subjectDMks + ", " + subjectDGrd);
        System.out.println(subjectE + ": " + subjectEMks + ", " + subjectEGrd);
        
        scanner1.close();
        
    }
}
