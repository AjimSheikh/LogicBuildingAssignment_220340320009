/*11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/

import java.util.Scanner;

class AssignmentQ11
{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		double r = sc.nextDouble();
		double pi = 3.141592653589793;
		double p = 2*pi*r;
		double a = pi*r*r;
		System.out.println("Perimeter is "+p);
		System.out.println("Area is "+a);
		
		}

}