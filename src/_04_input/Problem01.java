package _04_input;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] arg)
	{
//WAP in java input 2 number form user and sum,multiple,sub,division & %
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the frist number :");
		int a=sc.nextInt();
		
		System.out.print("Enter the second number :");
		int b=sc.nextInt();
		
		int sum= a+b;
		int mul= a*b;
		int sub= a-b;
		int div= a/b;
		int mod= a % b;
		
		System.out.println("The sum of two number :"+sum);
		System.out.println("The multiplication of two number :"+mul);
		System.out.println("The subtriction of two number :"+sub);
		System.out.println("The division of two number :"+div);
		System.out.println("The modularity of two number :"+mod);
		
		
	}

}
