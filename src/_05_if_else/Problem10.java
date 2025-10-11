 package _05_if_else;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] arg)
	{
		//WAP to input form user and print months
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the num manth b/w(1-12) :");
		int n=sc.nextInt();
		
		if(n == 1)
		{
			System.out.println("MANTH IS JANUARY");
		}
		else if(n == 2)
		{
			System.out.println("MANTH IS FEBRUARY");
		}
		else if(n == 3)
		{
			System.out.println("MANTH IS MARCH");
		}
		else if(n == 4)
		{
			System.out.println("MANTH IS APRIL");
		}
		else if(n == 5)
		{
			System.out.println("MANTH IS MAY");
		}
		else if(n == 6)
		{
			System.out.println("MANTH IS JUNE");
		}
		else if(n == 7)
		{
			System.out.println("MANTH IS JULY");
		}
		else if(n == 8)
		{
			System.out.println("MANTH IS AGUEST");
		}
		else if(n == 9)
		{
			System.out.println("MANTH IS SEPTEMBER");
		}
		else if(n == 10)
		{
			System.out.println("MANTH IS OCTOBER");
		}
		else if(n == 11)
		{
			System.out.println("MANTH IS NOVEMBER");
		}
		else if(n == 12)
		{
			System.out.println("MANTH IS DECEMBER");
		}
		else
		{
			System.out.println("INVALID");
		}
	}

}
