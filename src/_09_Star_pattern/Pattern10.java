package _09_Star_pattern;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] arg)
	{
		//print
		/*
		   *****
		   *   *
		   *   *
		   *   *
		   *****   
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				if(i==1 || j==1 || i==r || j==r)
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
