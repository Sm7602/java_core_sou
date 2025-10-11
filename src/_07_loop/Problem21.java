package _07_loop;

import java.util.Scanner;

public class Problem21 {
	public static void main(String[] arg)
	{
		//factros
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number");
		int n=sc.nextInt();
		
		int i=1;
		
		do
		{
			if(n % i==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i <= n);
		
		
	}

}
