package SkillBuilders;

import java.util.Scanner;

public class gradeAvg1 {

	public static void main(String[] args) {
		
		int total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter grade 1: ");
		total += input.nextInt();

		System.out.print("Enter grade 2: ");
		total += input.nextInt();

		System.out.print("Enter grade 3: ");
		total += input.nextInt();

		System.out.print("Enter grade 4: ");
		total += input.nextInt();

		System.out.print("Enter grade 5: ");
		total += input.nextInt();

		int avrg = total / 5;
		
		
		System.out.print("Your average is: " + avrg + "%");
	}

}
