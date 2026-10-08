/*

Program: Printing.java          Last Date of this Revision: October 5th 2026

Purpose: Create a printing application that prompts the user for the number of copies to print then displays the price per copy and the total price for the job 
 

*/
package Mastery;

//Import the scanner
import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		
		//create a name for the scanner
		Scanner input = new Scanner(System.in);

		//get the user to enter an amount of copies
        System.out.print("Enter amount of copies to be printed: ");
        int copies = input.nextInt();

        //Create a variable for the price per copy
        double PricePer = 0;

        //find the the price per copy using the amount of copies
        if (copies <= 99 && copies >= 0) {
        	PricePer = 0.30;
        } 
        else if (copies <= 499 && copies >= 100) {
        	PricePer = 0.28;
        } 
        else if (copies <= 749 && copies >= 500) {
        	PricePer = 0.27;
        } 
        else if (copies <= 1000 && copies >= 750) {
        	PricePer = 0.26;
        } 
        else {
            PricePer = 0.25;
        }

        
        //print the price per copy and the total cost
        System.out.println("Price per copy is: " + PricePer);

       double cost = copies * PricePer;
       
       System.out.print("Total cost is: " + cost);
        

	}

}

/*
Enter amount of copies to be printed: 67
Price per copy is: 0.3
Total cost is: 20.099999999999998 
 
*/
/*
Enter amount of copies to be printed: 67
Price per copy is: 0.3
Total cost is: 20.099999999999998 
 
*/
