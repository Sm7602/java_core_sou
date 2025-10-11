package _07_loop;

import java.util.Scanner;

public class Problem27 {
	public static void main(String[] arg)
	{
		//prime
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		int i = 2,c=0;
		
		do {
			if( n % i == 0)
			{
				c++;
			}
			i++;
		}
		while(i < n);
		
		if(c == 0)
		{
			System.out.println(n +" is Prime");
		}
		else
		{
			System.out.println(n +" is not Prime");
		}
	}

}
