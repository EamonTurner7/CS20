package Mastery;

import java.util.Scanner;

public class AddCoins {

	public static double getDollarAmount(double Quarters2, double Dimes2, double Nickles2, double Pennies2) {
		return Quarters2 + Dimes2 + Nickles2 + Pennies2;
		
        
    }
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enetr All Your Coins");
		System.out.println("Quaters: ");
		int Quarters = input.nextInt();
		
		System.out.println("Dimes: ");
		int Dimes = input.nextInt();
		
		System.out.println("Nickles: ");
		int Nickles = input.nextInt();
		
		System.out.println("Pennies: ");
		int Pennies = input.nextInt();
		
		double Quarters2 = Quarters * 0.25;
		
		double Dimes2 = Dimes * 0.10;
		
		double Nickles2 = Nickles * 0.05;
		
		double Pennies2 = Pennies * 0.01;
		
		double dollarAmount = getDollarAmount( Quarters2, Dimes2, Nickles2, Pennies2);
		
		System.out.print("total: $" + dollarAmount);
	}

}
