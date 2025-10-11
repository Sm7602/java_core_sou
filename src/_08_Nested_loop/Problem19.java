package _08_Nested_loop;

import java.util.Scanner;

public class Problem19 {
	public static void main(String[] arg)
	{
		//print
		/*
		   E E E E E
		   D D D D
		   C C C
		   B B
		   A
		 */
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Eneter a char :");
		char ch = sc.next().charAt(0);
		
		for(char i=ch;i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	
	}

}
