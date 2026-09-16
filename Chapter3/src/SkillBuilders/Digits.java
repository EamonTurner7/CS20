package SkillBuilders;

import java.util.Scanner;

public class Digits
{

	public static void main(String[] args) 
	{ 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 2-digit number: ");
	int number = input.nextInt();
	
	
	int tens = number / 10;
	int ones = number % 10;
	
	
	if (number >= 10 && number <= 99) {
	    System.out.println("That's a 2-digit number!");
	    System.out.println("The tens digit number is: " + tens);
		System.out.println("the ones digit number is: " + ones);
	
	
	} else {
	    System.out.println("That's not a 2-digit number.");
	
		

	}
	
	
	
	
	
	
	
	
	}

}