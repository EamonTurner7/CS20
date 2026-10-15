package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {

		//create 2 variables
		int min, max;
	
		//create the scanner
		Scanner input = new Scanner(System.in);
		
		//ask the user the minimum number
		System.out.println("enter the minunum number: ");
		min = input.nextInt();
		
		//ask for max number
		System.out.println("enter the max number: ");
		max = input.nextInt();
		
		//generate random number
		System.out.println("Random number: " + (int)((max - min + 1)* Math.random() + min));
		
		

	}

}
