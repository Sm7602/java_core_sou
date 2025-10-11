package _08_Nested_loop;

import java.util.Scanner;

public class Problem25 {
	public static void main(String[] arg)
	{
		//print
		/*A A A A A 
		  B B B B
		  C C C 
		  D D
		  E
		 */
		
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch= sc.next().charAt(0);
		
		
		for(char i='A';i<=ch;i++)
		{
			for(char j=i;j<=ch;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}