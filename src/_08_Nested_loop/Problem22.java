package _08_Nested_loop;

import java.util.Scanner;

public class Problem22 {
	public static void main(String[] arg)
	{
		//print
		/*
		   E
		   D E
		   C D E
		   B C D E
		   A B C D E
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch= sc.next().charAt(0);
		
		
		for(char i=ch;i>='A';i--)
		{
			for(char j=i;j<=ch;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
