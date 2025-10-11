package _08_Nested_loop;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] arg)
	{
		//print
		/*
		   5
		   45
		   345
		   2345
		   12345
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		for(int i= n; i>=1; i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

}
