
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
