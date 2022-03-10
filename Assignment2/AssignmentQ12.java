/*12. Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/

import java.util.Scanner;

class AssignmentQ12
{
	public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the three numbers whose Average you want");
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double avg = (a+b+c)/3;
		
		System.out.println("Average of "+a+" , "+b+" and "+c+" is "+avg);

		}

}