package _08_Nested_loop;

import java.util.Scanner;

public class Problem23 {
	public static void main(String[] arg)
	{
		//print
		/*A B C D E
		  B C D E
		  C D E
		  D E
		  E
		 */
		
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch= sc.next().charAt(0);
		
		
		for(char i='A';i<=ch;i++)
		{
			for(char j=i;j<=ch;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
