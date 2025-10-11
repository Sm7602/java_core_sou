package _08_Nested_loop;

import java.util.Scanner;

public class Problem15 {
	public static void main(String[] arg)
	{
		//print
				/*
				   A B C D E
				   A B C D E
				   A B C D E
				   A B C D E
				   A B C D E
				 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the row :");
		char row=sc.next().charAt(0);
		
		System.out.print("Enter the col :");
		char col=sc.next().charAt(0);
		
		for(char i='A';i<=row;i++)
		{
			for(char j='A';j<=col;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
