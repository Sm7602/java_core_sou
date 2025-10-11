package _08_Nested_loop;

import  java.util.Scanner;

public class Problem03 {
	public static void main(String[] arg)
	{
		/*
		   1
		   12
		   123
		   1234
		   12345
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter num :");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
