package _07_loop;

import java.util.Scanner;

public class Problem22 {
	public static void main(String[] arg)
	{
		//table
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n  =sc.nextInt();
		
		
		int i=1;
		
		do {
			System.out.println(n * i);
			i++;
		   }
		while(i <= 10);
		
		
	}

}
