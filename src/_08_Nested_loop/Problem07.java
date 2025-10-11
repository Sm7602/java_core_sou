package _08_Nested_loop;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] arg)
	{
		//print
		/*
		   1
		   21
		   321
		   4321
		   54321
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		for(int i=1; i<=n;i++)
		{
			for(int j=i; j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
