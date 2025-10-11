package _08_Nested_loop;

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] arg)
	{
		//print
		/*
		   A B C D E
		   A B C D
		   A B C
		   A B
		   A
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enetr a char :");
		char ch=sc.next().charAt(0);
		
		for(char i=ch;i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
	}

}
