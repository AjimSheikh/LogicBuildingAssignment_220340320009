/*5. Write a Java program that takes two numbers as input and display the product of
two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;

class AssignmentQ5
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers whose Multiplication you want");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a*b;
		
		System.out.println("Multiplication of "+a+" and "+b+" is "+c);

		}

}