package Mastery;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of copies to be printed: ");
        int copies = input.nextInt();

        double PricePer = 0;

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

        
        
        System.out.println("Price per copy is: " + PricePer);

       double cost = copies * PricePer;
       
       System.out.print("Total cost is: " + cost);
        

	}

}
