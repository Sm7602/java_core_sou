package _08_Nested_loop;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] arg)
	{
		//print
		/*
		   55555
		   4444
		   333
		   22
		   1
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n =sc.nextInt();
		
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
