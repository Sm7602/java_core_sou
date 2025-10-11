package _07_loop;

import java.util.Scanner;

public class Problem15 {
	public static void main(String[] arg)
	{
		//print series
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
		 1
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		int i =1;
		
		while(i <= n)
		{
			if(i % 2 == 0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("1");
			}
			i++;
		}
	}

}
