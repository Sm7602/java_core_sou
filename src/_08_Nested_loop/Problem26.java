package _08_Nested_loop;

import java.util.Scanner;

public class Problem26 {
	public static void main(String[] arg)
	{
		//print
		/*A 
		  B C 
		  D E F
		  G H I J
		  K L M N O
		 */
		
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch= sc.next().charAt(0);
		
		char n='A';
		
		
		for(char i='A';i<=ch;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print((n++)+" ");
			}
			System.out.println();
		}
	}

}