/*

Program:Mysavings.java          Last Date of this Revision: November 23th 2026

Purpose: Create an application that displays a menu of choices for entering pennies, nickels, dimes and quarters into a piggy bank and then prompts the user to make a selection
 

*/
package Mastery;

import java.util.Scanner;

public class MySavings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PiggyBank bank = new PiggyBank();

        int choice = -1;

        while (choice != 0) {

            System.out.println();
            System.out.println("1. Show total in bank");
            System.out.println("2. Add a penny");
            System.out.println("3. Add a nickel");
            System.out.println("4. Add a dime");
            System.out.println("5. Add a quarter");
            System.out.println("6. Take money out of bank");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Total in bank: $"
                            + String.format("%.2f", bank.getTotal()));
                    break;

                case 2:
                    bank.addPenny();
                    System.out.println("Penny added!");
                    break;

                case 3:
                    bank.addNickel();
                    System.out.println("Nickel added!");
                    break;

                case 4:
                    bank.addDime();
                    System.out.println("Dime added!");
                    break;

                case 5:
                    bank.addQuarter();
                    System.out.println("Quarter added!");
                    break;

                case 6:
                    System.out.print("Enter amount to remove in cents: ");
                    int amount = input.nextInt();

                    if (bank.removeMoney(amount)) {
                        System.out.println("Money removed!");
                    } else {
                        System.out.println("Not enough money in bank!");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        input.close();
    }
}
/*

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 4
Dime added!

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 5
Quarter added!

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 5
Quarter added!

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.60

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 0
Goodbye!
*/
/*


1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 3
Nickel added!

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 4
Dime added!

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.15

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice: 0
Goodbye!

*/