package _08_Nested_loop;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] arg)
	{
		//print
		/*
		   111111
		   2222
		   333
		   44
		   5
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}