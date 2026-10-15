package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		double Number = input.nextInt();
		
		if ((Math.sqrt(Number)) % 1 == 0) {
			
			System.out.print("your number is a perfect square!!");
		}
		
		else {
			
			System.out.print("your number is not a perfect square :(");
		}
		
		
		
		
	}
}
