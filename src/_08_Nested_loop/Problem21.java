package _08_Nested_loop;

import java.util.Scanner;

public class Problem21 {
	public static void main(String[] arg)
	{
		//print
		/*
		  E D C B A
		  D C B A
		  C B A
		  B A
		  A
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch=sc.next().charAt(0);
		
		for(char i=ch;i>='A';i--)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
