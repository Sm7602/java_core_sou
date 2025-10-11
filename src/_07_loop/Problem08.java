package _07_loop;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] arg)
	{
		// power
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base :");
		int b=sc.nextInt();
		
		System.out.print("Enter power :");
		int p=sc.nextInt();
		
		int mul=b;
		
		for(int i=1; i < p;i++)
		{
			mul *=b;
		}
		System.out.println(mul);
	}

}
