/*

Program:DigitDisplay.java          Last Date of this Revision: October 13th 2026

Purpose: create an application where the user enters a non negative integer and then displays each digit on a separate line 
 

*/

package Mastery;

import java.util.Scanner;

public class DigitDisplay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        while (num > 0) {
        	System.out.println(num % 10);
            num = num / 10;
            
        }

        input.close();
	}
}


 /*
 Enter a non-negative integer: 74893
3
9
8
4
7
*/
/*
Enter a non-negative integer: 978
8
7
9
*/
