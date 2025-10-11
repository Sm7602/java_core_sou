package _08_Nested_loop;

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] arg)
	{
		//print
		/*
		   AAAAA
		   BBBBB
		   CCCCC
		   DDDDD
		   EEEEE
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a row :");
		char row=sc.next().charAt(0);
		
		System.out.print("Enter a col :");
		char col=sc.next().charAt(0);
		
		for(char i='A';i<=row;i++)
		{
			for(char j='A';j<=col;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
