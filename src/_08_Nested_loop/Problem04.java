package _08_Nested_loop;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] arg)
	{
		/*-
		   12345
		   1234
		   123
		   12
		   1
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		int n=sc.nextInt();
		
		 for(int i=n; i>=1;i--)
		 {
			 for(int j=1; j<=i;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	}

}
