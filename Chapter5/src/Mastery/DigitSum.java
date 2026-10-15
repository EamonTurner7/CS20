/*

Program:DigitSum.java          Last Date of this Revision: October 15th 2026

Purpose: create an application that 
 

*/
package Mastery;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();
        int newnum;
        int total = 0;
        while (num > 0) {
        	newnum = num % 10;
            total += newnum;
        	num = num / 10;
            
        }
        System.out.print(" the total of those numbers is: " + total);
        input.close();

	}

}

