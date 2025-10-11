package _08_Nested_loop;

import java.util.Scanner;

public class Problem16 {
	public static void main(String[] arg)
	{
		//print
		/*
		   A
		   A B
		   A B C
		   A B C D
		   A B C D E
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the char :");
		char ch=sc.next().charAt(0);
		
		for(char i = 'A';i<=ch;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
