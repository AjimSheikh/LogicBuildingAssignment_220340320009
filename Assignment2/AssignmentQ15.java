/*15. Write a Java program to swap two variables.*/

import java.util.Scanner;

class AssignmentQ15
{
	public static void main(String args[])
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before Swap");
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		System.out.println("After Swap");
		
		int z;
		z=a;
		a=b;
		b=z;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);

		
		}

}