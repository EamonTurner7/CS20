/*

Program:AddCoins.java          Last Date of this Revision: October 28th 2026

Purpose: create an application that prompts the user for the number of pennies, nickels, dimes, and quarters, and then displays the total dollar amount
 

*/
package Mastery;


import java.util.Scanner;

public class AddCoins {

	public static double getDollarAmount(double Quarters2, double Dimes2, double Nickels2, double Pennies2) {
		return Quarters2 + Dimes2 + Nickels2 + Pennies2;
		
        
    }
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter All Your Coins");
		System.out.println("Quarters: ");
		int Quarters = input.nextInt();
		
		System.out.println("Dimes: ");
		int Dimes = input.nextInt();
		
		System.out.println("Nickels: ");
		int Nickels = input.nextInt();
		
		System.out.println("Pennies: ");
		int Pennies = input.nextInt();
		
		double Quarters2 = Quarters * 0.25;
		
		double Dimes2 = Dimes * 0.10;
		
		double Nickels2 = Nickels * 0.05;
		
		double Pennies2 = Pennies * 0.01;
		
		double dollarAmount = getDollarAmount( Quarters2, Dimes2, Nickels2, Pennies2);
		
		System.out.print("total: $" + dollarAmount);
	}

}
/*
Enter All Your Coins
Quarters: 
32
Dimes: 
43
Nickels: 
23
Pennies: 
12
total: $13.57

*/
/*
Enter All Your Coins
Quarters: 
56
Dimes: 
43
Nickels: 
23
Pennies: 
12
total: $19.57
*/