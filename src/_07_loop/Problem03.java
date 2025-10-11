package _07_loop;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] arg)
	{
		//factor
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
	}

}
