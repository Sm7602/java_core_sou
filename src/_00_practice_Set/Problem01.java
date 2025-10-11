package _00_practice_Set;

//java program to print on integer (entered by the user)

import java.util.Scanner;

public class Problem01 {
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER A NUM : ");
		int n=sc.nextInt();
		
		System.out.println(n);
		sc.close();
	}

}
