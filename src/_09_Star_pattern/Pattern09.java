package _09_Star_pattern;

import java.util.Scanner;

public class Pattern09 {
	public static void main(String[] arg)
	{
		//print
		/*
		       *
		      **
		     * *
		    *  *
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
				if(i==j || j==1 || i==r)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
