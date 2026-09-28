package SkillBuilders;
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter hurricane category (1-5): ");
        int category = input.nextInt();

        double mph = 0;

        if (category == 1) {
            mph = 74;
        } 
        else if (category == 2) {
            mph = 96;
        } 
        else if (category == 3) {
            mph = 111;
        } 
        else if (category == 4) {
            mph = 130;
        } 
        else if (category == 5) {
            mph = 157;
        } 
        else {
            System.out.println("Invalid category.");
            return;
        }

        double knots = mph * 0.868976;
        double kmh = mph * 1.60934;

        System.out.println("Wind Speed:");
        System.out.println(mph + " miles per hour");
        System.out.println(knots + " knots");
        System.out.println(kmh + " kilometers per hour");

	}

}
