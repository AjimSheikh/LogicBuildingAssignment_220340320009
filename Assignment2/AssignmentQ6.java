/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

import java.util.Scanner;

class AssignmentQ6
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int p = a+b;
			int r = a-b;
			int q = a*b;
			int s = a/b;
			int t = a%b;
		
		System.out.println("Addition of "+a+" and "+b+" is "+p);
		System.out.println("Subtraction of "+a+" and "+b+" is "+r);
		System.out.println("Multiplication of "+a+" and "+b+" is "+q);
		System.out.println("Division of "+a+" and "+b+" is "+s);
		System.out.println("Remainder of "+a+" and "+b+" is "+t);

		}

}