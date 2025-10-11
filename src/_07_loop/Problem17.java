package _07_loop;

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] arg)
	{
		//WAP to print prime number
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Eneter a number :");
		int n=sc.nextInt();
		
		int i= 2,c=0;
		
		while(i < n)
		{
			if(n % 2 == 0)
			{
				c++;
			}
			i++;
		}
		if(n==0)
		{
			System.out.println(n +"is prime");
		}
		else
		{
			System.out.println(n +" is not prime");
		}
	}

}
