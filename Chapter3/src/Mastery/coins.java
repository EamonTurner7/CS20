/*

Program: coins.java          Last Date of this Revision: September 21, 2026

Purpose: Create a change application that prompts the user for an amount and then displays the mininum number of coins necessary to make the change

Author: Eamon Turner, 
School: CHHS
Course: CS 20 ??
 

*/

package Mastery;

// Import the scanner into the project
import java.util.Scanner;

public class coins {

	public static void main(String[] args) {
		//create a name for the scanner
		Scanner input = new Scanner(System.in);
		
		//get the user to input a number of cents
		System.out.print("enter the amount of cents you want to distribute: ");
		int Cents = input.nextInt();
		
		//create the coins variables
		int Quarters, Dimes, Nickels, Pennies;
		
		//create the amount of quarters needed
		Quarters = Cents / 25;
		Cents = Cents % 25;
		
		//create the amount of Dimes needed
        Dimes = Cents / 10;
        Cents = Cents % 10;
        
        //create the amount of Nickels needed
        Nickels= Cents / 5;
        Cents = Cents % 5;
        
        //create the amount of pennies needed
        Pennies = Cents;
        
        
        //print all the coins
		System.out.println("Quarters: " + Quarters);
		System.out.println("Dimes: " + Dimes);
		System.out.println("Nickels: " + Nickels);
		System.out.println("Pennies: " + Pennies);
		
		
		
	}

}
/* enter the amount of cents you want to distribute: 54
Quarters: 2
Dimes: 0
Nickels: 0
Pennies: 4
*/
/*
enter the amount of cents you want to distribute: 50005
Quarters: 2000
Dimes: 0
Nickels: 1
Pennies: 0
*/