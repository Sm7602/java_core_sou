package _04_input;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] arg)
	{
//WAP in  java input form user age,name,mark and print
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter your name :");
		String name=sc.nextLine();
		
		System.out.print("Enter your age :");
		int age=sc.nextInt();
		
		System.out.print("Enter your mark :");
		float mark=sc.nextFloat();
		
		
		
		
		System.out.println("------OUTPUT------");
		
		System.out.println("The name of user : "+name);
		System.out.println("The age of user :"+age);
		System.out.println("The mark of user :"+mark);
		
		
		
		}

}
