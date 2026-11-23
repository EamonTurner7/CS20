package Mastery;
import java.util.ArrayList;
import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bowler> bowlers = new ArrayList<>();

        System.out.print("Enter how many bowlers: ");
        int numBowlers = input.nextInt();
        input.nextLine();

        // Create the bowlers
        for (int bowler = 0; bowler < numBowlers; bowler++) {
            System.out.print("Enter the name for bowler " + (bowler + 1) + ": ");
            String name = input.nextLine();
            bowlers.add(new Bowler(name));
        }

        // 10 frames in a bowling game
        for (int frame = 1; frame <= 5; frame++) {
            System.out.println("\n--- FRAME " + frame + " ---");

            for (Bowler b : bowlers) {
                b.bowlFrame(frame);
            }
        }

        // Final Scores
        System.out.println("\n---FINAL SCORES---");
        for (Bowler b : bowlers) {
            System.out.println(b.getName() + ": " + b.getScore());
        }

        input.close();
    }
}