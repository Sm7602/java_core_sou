package _00_practice_Set;
//Write a Program to Find Sum of Fibonacci Series Number
import java.util.Scanner;
public class Problem11 {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter num : ");
	    int n=sc.nextInt();
	    int a=0;
	    int b=1;
	    System.out.println(a);
	    System.out.println(b);
	    for(int i=0;i<=n;i++)
	    {
	    	int c=a+b;
	    	a=b;
	    	b=c;
	    	System.out.println(c);
	    }
	}

}
