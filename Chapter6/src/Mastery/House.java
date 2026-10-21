/*

Program:DigitSum.java          Last Date of this Revision: October 21th 2026

Purpose: create an application that calls methods addRoof, addBase, and addWalk to display the following
 

*/


package Mastery;

import java.util.Scanner;

public class House {

    public static void addRoof() {
    	System.out.println("       /\\");
        System.out.println("      /  \\");
        System.out.println("     /    \\");
        System.out.println("    /      \\");
        System.out.println("   /________\\");
    }

    public static void addBase() {
    	System.out.println("   I        I");
        System.out.println("   I        I");
        System.out.println("   I        I");
        System.out.println("   I________I");
    }

    public static void addWalk() {
    	System.out.println("       **");
        System.out.println("       ****************");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. Roof");
        System.out.println("2. Base");
        System.out.println("3. Walk");
        System.out.println("4. Roof and Walk");
        System.out.println("5. Roof and Base");
        System.out.println("6. Base and Walk");
        System.out.println("7. All three parts");

        System.out.print("Choose an option: ");
        int choice = input.nextInt();

        if (choice == 1) {
            addRoof();
        }
        else if (choice == 2) {
            addBase();
        }
        else if (choice == 3) {
            addWalk();
        }
        else if (choice == 4) {
            addRoof();
            addWalk();
        }
        else if (choice == 5) {
            addRoof();
            addBase();
        }
        else if (choice == 6) {
            addBase();
            addWalk();
        }
        else if (choice == 7) {
            addRoof();
            addBase();
            addWalk();
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
/*
1. Roof
2. Base
3. Walk
4. Roof and Walk
5. Roof and Base
6. Base and Walk
7. All three parts
Choose an option: 7
       /\
      /  \
     /    \
    /      \
   /________\
   I        I
   I        I
   I        I
   I________I
       **
       ****************

*/
/*
1. Roof
2. Base
3. Walk
4. Roof and Walk
5. Roof and Base
6. Base and Walk
7. All three parts
Choose an option: 4
       /\
      /  \
     /    \
    /      \
   /________\
       **
       ****************
*/