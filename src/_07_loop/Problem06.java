package _07_loop;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] arg)
	{
		// table
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		for(int i=1;i <= 10;i++)
		{
			System.out.println(n*i);
		}
	}

}
