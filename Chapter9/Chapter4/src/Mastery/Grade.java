/*

Program: Grade.java          Last Date of this Revision: October 5th, 2026

Purpose: Create a grade application that prompts the user for the percentage earned on a test or other graded work then displays the corresponding letter grade

Author: Eamon Turner, 
School: CHHS
Course: CS 20 ??
 

*/
package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int Percentage = input.nextInt();

        String Grade;

        if (Percentage <= 100 && Percentage >= 90) {
        	Grade = "A";
        } 
        else if (Percentage <= 89 && Percentage >= 80) {
        	Grade = "B";
        } 
        else if (Percentage <= 79 && Percentage >= 70) {
        	Grade = "C";
        } 
        else if (Percentage <= 60 && Percentage >= 69) {
        	Grade = "D";
        } 
        else {
        	Grade = "F";
        
        }
        
        System.out.print("your grade fits in the category of: " + Grade);
        }

	}
/*

Enter your grade: 100
your grade fits in the category of: A
 
 

*/
/*

Enter your grade: 63
your grade fits in the category of: F
 
 

*/
