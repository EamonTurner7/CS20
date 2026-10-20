package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

	  public static double hoursToMinutes(double hours) {
	        return hours * 60;
	    }

	    public static double daysToHours(double days) {
	        return days * 24;
	    }

	    public static double minutesToHours(double minutes) {
	        return minutes / 60;
	    }

	    public static double hoursToDays(double hours) {
	        return hours / 24;
	    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");

        System.out.print("Choose a conversion: ");
        int choice = input.nextInt();

        System.out.print("Enter the amount of time: ");
        double time = input.nextDouble();

        if (choice == 1) {
            System.out.println(hoursToMinutes(time) + " minutes");
        }
        else if (choice == 2) {
            System.out.println(daysToHours(time) + " hours");
        }
        else if (choice == 3) {
            System.out.println(minutesToHours(time) + " hours");
        }
        else if (choice == 4) {
            System.out.println(hoursToDays(time) + " days");
        }
        else {
            System.out.println("Invalid choice!");
        }

        input.close();
	}

}
