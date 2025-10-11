package _08_Nested_loop;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] arg)
	{
		//print
		/*
		  54321
		  4321
		  321
		  21
		  1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n = sc.nextInt();
		
		
		for(int i= n; i>=1;i--)
		{
			for(int j =i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
