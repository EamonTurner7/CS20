package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("enter the height: ");
		        int Height = input.nextInt();

		System.out.print("enter the length: ");
		        int Length = input.nextInt();

		System.out.print("enter the width: ");
		        int width = input.nextInt();

		if (Height < 10 && Length < 10 && width < 10) {
		System.out.print("Accept");
		        }
		else {
		System.out.print("Reject");
		        }
		

		
			
		}
	}

