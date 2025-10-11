package _07_loop;

import java.util.Scanner;

public class Problem26 {
	public static void main(String[] arg)
	{
		//factorial
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		int i=1,m=1;
		
		do {
			m *= i;
			i++;
		}
		while(i <= n);
		
		System.out.println(m);
	}

}
