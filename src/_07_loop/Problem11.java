package _07_loop;

import java.util.Scanner;

public class Problem11 {
	public static void main(String[] arg)
	{
		// factors
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		int i=1;
		while(i <= n)
		{
			if(n % i ==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
