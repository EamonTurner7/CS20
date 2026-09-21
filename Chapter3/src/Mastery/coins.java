package Mastery;


import java.util.Scanner;

public class coins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter the amount of cents you want to distribute: ");
		int Cents = input.nextInt();

		int Quarters, Dimes, Nickles, Pennies;
		
		Quarters = Cents / 25;
		Cents = Cents % 25;

        Dimes = Cents / 10;
        Cents = Cents % 10;

        Nickles= Cents / 5;
        Cents = Cents % 5;

        Pennies = Cents;
        
        
        
		System.out.println("Quarters: " + Quarters);
		System.out.println("Dimes: " + Dimes);
		System.out.println("Nickles: " + Nickles);
		System.out.println("Pennies: " + Pennies);
		
		
		
	}

}