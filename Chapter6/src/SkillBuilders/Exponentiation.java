
package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

    public static int powerOf(int number, int exponent) {
        return (int) Math.pow(number, exponent);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println(num1 + " raised to the power of " + num2 + " is " + powerOf(num1, num2));
    }
}

