package _07_loop;

import java.util.Scanner;

public class Problem28 {
	public static void main(String[] arg)
	{
		//febonic series
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n= sc.nextInt();
		
		int a=0,b=1,c;
		int i=1;
		System.out.println(a);
		System.out.println(b);
		
		do {
			c= a + b;
			a = b;
			b = c;
			System.out.println(c);
			i++;
		}
		while(i <= n);
	}

}
