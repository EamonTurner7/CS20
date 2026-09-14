package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
		//Declare Variables
		int length;
		int width;
		int area;
		int perimeter; 
		
		//Create a Scanner Object]
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the width
		System.out.print("enter the width: ");
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Ask the user to enter the length
		System.out.print("enter the length: ");
		
		//Get the width value from the user
		length = userinput.nextInt();
		
		
		//display the width and length
		System.out.println("The width is: " + width);
		System.out.println("The length is: " + length);
		
		
		//calculate area
		area = length * width;
		
		//Calculate perimeter
		perimeter = length + width;
		
		//display area
		System.out.println("Area =" + area);
		
		//display perimeter
		System.out.println("Perimetere =" + perimeter);
		
	}

}
