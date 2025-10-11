package _08_Nested_loop;

import java.util.Scanner;

public class Problem18 {
	public static void main(String[] arg)
	{
		//print
		/*
		   A
		   B B
		   C C C
		   D D D D
		   E E E E E
		 */
		
		Scanner sc= new Scanner(System.in);	
		
		System.out.print("Enter a char :");
		char ch=sc.next().charAt(0);
		
		for(char i='A'; i<=ch;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
