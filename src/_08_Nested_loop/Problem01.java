package _08_Nested_loop;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] arg)
	{
		/*
		   11111
		   22222
		   33333
		   44444
		   55555
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row :");
		int r=sc.nextInt();
		
		System.out.print("Enter column :");
		int c=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
