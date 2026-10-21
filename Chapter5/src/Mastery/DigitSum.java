/*

Program:DigitSum.java          Last Date of this Revision: October 15th 2026

Purpose: create an application that prompts the user for a non negative integer, and then displays the sum of all the digits added together 
 

*/
package Mastery;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		
		//create a name for the scanner
		Scanner input = new Scanner(System.in);
		
		//ask the user for a number
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();
        
        //create a variable for the digits of your number
        int newnum;
        
        //create a variable for the sum of your digits
        int total = 0;
       
        //put the number you inputed into this loop that adds the digits of your number together and adds it to the total
        while (num > 0) {
        	newnum = num % 10;
            total += newnum;
        	num = num / 10;
            
        }
        
        //print the total of of those numbers
        System.out.print(" the total of those numbers is: " + total);
        

	}

}

/*
Enter a non-negative integer: 654
 the total of those numbers is: 15
*/
/*
Enter a non-negative integer: 88
 the total of those numbers is: 16
*/