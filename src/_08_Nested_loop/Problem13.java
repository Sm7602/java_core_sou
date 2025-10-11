package _08_Nested_loop;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] arg)
	{
		//print
		/*
		   1
		   23
		   456
		   78910
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		int r=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(r++);
			}
			System.out.println();
		}
	}

}