package _08_Nested_loop;

import java.util.Scanner;

public class Problem20 {
	public static void main(String[] arg)
	{
		//print
		/*
		 A
		 B A
		 C B A
		 D C B A
		 E D C B A
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch =sc.next().charAt(0);
		
		
		for(char i='A';i<=ch;i++)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
