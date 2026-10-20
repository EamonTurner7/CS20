package SkillBuilders;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		//name the scanner
		Scanner input = new Scanner(System.in);
		
		//ask user to enter in number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        //create the sum variable
        int sum = 0;
        
        //count up to the number the user inputed, while each number is being put on a different line and added to the sum
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum: " + sum);

	}

}
