package _09_Star_pattern;

import java.util.Scanner;

public class Pattern01 {
	public static void main(String[] arg)
	{
		//print
		/*
		   *****
		   *****
		   *****
		   *****
		   *****
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int r=sc.nextInt();
		
		System.out.print("Enter col : ");
		int c=sc.nextInt();
		
		for(int i =1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
