package _07_loop;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] arg)
	{
		//print the series
		/*
		   1
		   0
		   1
		   0
		   1
		   0
		   1
		   0
		   1
		   0
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		
		
		int i=1;
		
		while(i <= n )
		{
			System.out.println("1\n0");
			i++;
		}
		
	}

}
