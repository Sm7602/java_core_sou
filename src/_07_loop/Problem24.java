package _07_loop;

import java.util.Scanner;

public class Problem24 {
	public static void main(String[] arg)
	{
		//print
		/*\
		    1
		    0
		    1
		    0
		    1
		    0
		    1
		    0
		    1
		    0
		    1
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		int i =1;
		
		do {
			if(i % 2==0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("1");
			}
			i++;
		}
		while(i <= n);
	}

}
