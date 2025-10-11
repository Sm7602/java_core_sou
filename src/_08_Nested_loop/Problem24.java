package _08_Nested_loop;

import java.util.Scanner;

public class Problem24 {
	public static void main(String[] arg)
	{
		//print
		/*E
		  D D
		  C C C
		  B B B B
		  A A A A A
		 */
		
	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a char :");
		char ch= sc.next().charAt(0);
		
		
		for(char i=ch;i>='A';i--)
		{
			for(char j=i;j<=ch;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}