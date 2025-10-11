package _07_loop;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[]  arg)
	{
		// table
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int  n=sc.nextInt();
		
		int i= 1;
		
		while(i <= 10)
		{
			System.out.println(n*i);
			i++;
		}
		
	}

}
