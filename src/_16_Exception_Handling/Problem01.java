package _16_Exception_Handling;
/*Write a Java program to create a method that takes
 *  an integer as a parameter and throws an exception if the number is odd.
 */

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num  : ");
		int n=sc.nextInt();
		
		boolean b=false;
		
		if(n % 2 ==0)
		{
			System.out.print("Even num............... ");
		}
		else
		{
			b=true;
		}
		
		if(b==true)
		{
		  System.err.print("ERORR.... not allow odd num...");
		}
		
	
		
		
	}

}
