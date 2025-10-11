package _09_Star_pattern;

import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] arg)
	{
		//print
				/*
				       * 
				      *** 
				     *****
				    *******
				   *********
				   *********
				    *******
				     *****
				      ***
				       * 
				 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row :");
		int r=sc.nextInt();
		
		//upper
		
		for(int i=1;i<=r;i++)
		{
			for(int s=i;s<r;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower
		
				for(int i=r;i>=1;i--)
				{
					for(int s=i;s<r;s++)
					{
						System.out.print(" ");
					}
					for(int j=1;j<=i*2-1;j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
	}

}