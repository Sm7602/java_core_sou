package _09_Star_pattern;

import java.util.Scanner;

public class Pattern04 {
	public static void main(String[] arg)
	{
		//print
		/*
		       *
		      **
		     ***
		    ****
		   *****
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int s=i;s<r;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
