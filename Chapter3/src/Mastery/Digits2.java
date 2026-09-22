/*

Program: Digits2.java          Last Date of this Revision: September 22, 2026

Purpose: show the hundreds, tens, and ones, of a 3 digit number inputed by the user

Author: Eamon Turner, 
School: CHHS
Course: CS-20
 

*/


package Mastery;

import java.util.Scanner;

public class Digits2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 3-digit number: ");
	int number = input.nextInt();
	
	
	int hundreds = (number / 10) / 10;
	int ones = number % 10;
	int tens = (number % 100 - ones) / 10;
	
	if (number >= 100 && number <= 999) {
	    System.out.println("That's a 3-digit number!");
	    System.out.println("The hundreds digit number is: " + hundreds);
	    System.out.println("The tens digit number is: " + tens);
		System.out.println("the ones digit number is: " + ones);
	
	
	} else {
	    System.out.println("That's not a 3-digit number.");

	}
/*
 Enter a 3-digit number: 564
That's a 3-digit number!
The hundreds digit number is: 5
The tens digit number is: 6
the ones digit number is: 4
*/

/*
 Enter a 3-digit number: 456
That's a 3-digit number!
The hundreds digit number is: 4
The tens digit number is: 5
the ones digit number is: 6
 */
	
}
}