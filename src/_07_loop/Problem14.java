package _07_loop;

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] arg)
	{
		//WAP to print factorial
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n= sc.nextInt();
		
		int i=1,m=1;
		
		while(i <= n)
		{
			m *=i;
			
			System.out.println(m);
			i++;
		}
		
	}

}
