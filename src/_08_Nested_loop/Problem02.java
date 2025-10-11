package _08_Nested_loop;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] arg)
	{
		/*
		  12345
		  12345
		  12345
		  12345
		  12345
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter row : ");
		int r=sc.nextInt();
		
		System.out.print("Enter column : ");
		int c=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1; j<=c;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
