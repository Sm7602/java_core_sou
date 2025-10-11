package _05_if_else;

import java.util.Scanner;

public class Problem16 {
	public static void main(String[] arg)
	//WAp to input form user a b c check the max number using nested if else
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter frist num :");
		int a=sc.nextInt();
		
		System.out.print("Enter second num :");
		int b=sc.nextInt();
		
		System.out.print("Enter third num :");
		int c=sc.nextInt();
		
		if(a > b)
		{
			if(a > c)
			{
				System.out.println( a +" is max");
			}
			else
			{
				System.out.println(c + " is max");
			}
		}
		else
		{
			if(b > c)
			{
				System.out.println(b + " is max");
			}
			else
			{
				System.out.println(c + " is max");
			}
		}
		

		
	}

}
