package _08_Nested_loop;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] arg)
	{
		//print
		/*
		   1
		   22
		   333
		   4444
		   55555
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a numm :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
