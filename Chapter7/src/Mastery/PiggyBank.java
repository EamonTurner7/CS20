/*

Program:PiggyBank.java          Last Date of this Revision: November 23th 2026

Purpose: Create an object that can add coins to the Piggy bank, remove coins, and return the total amount of the bank
 

*/
package Mastery;

public class PiggyBank {

    private int totalCents;

    public PiggyBank() {
        totalCents = 0;
    }

    public void addPenny() {
        totalCents += 1;
    }

    public void addNickel() {
        totalCents += 5;
    }

    public void addDime() {
        totalCents += 10;
    }

    // Add a quarter
    public void addQuarter() {
        totalCents += 25;
    }

    // Remove money from the bank
    public boolean removeMoney(int cents) {
        if (cents <= totalCents && cents > 0) {
            totalCents -= cents;
            return true;
        }

        return false;
    }

    // Return total amount in the bank
    public double getTotal() {
        return totalCents / 100.0;
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