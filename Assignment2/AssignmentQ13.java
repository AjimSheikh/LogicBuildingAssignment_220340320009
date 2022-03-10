/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.util.Scanner;

class AssignmentQ13
{
	public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Width and Height of Rectangle");
		float w = sc.nextFloat();
		float h = sc.nextFloat();

		float p = 2*(w+h);
		float a = w*h;
		System.out.println("Perimeter is "+p);
		System.out.println("Area is "+a);
		
		}

}