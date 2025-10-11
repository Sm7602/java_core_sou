package _07_loop;

import java.util.Scanner;

public class Problem29 {
	public static void main(String[] arg)
	{
		//power
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter base :");
		int b=sc.nextInt();
		
		System.out.print("Enter power :");
		int p=sc.nextInt();
		
		
		int i=1,m=b;
		
		do {
			m *=b;
			i++;
		}
		while(i < p);
			System.out.print(m);
			
		
	}

}
