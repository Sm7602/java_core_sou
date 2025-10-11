package _06_Switch;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] arg)
	{
		//WAP to create a calculator using switch
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter frist num :");
		int a=sc.nextInt();
		
		System.out.print("Enter second num :");
		int b=sc.nextInt();
		
		System.out.print("Enter anyone( +,-,*,/,% ):");
		char op=sc.next().charAt(0);
		
		   switch(op)
		   {
		   case '+' :
			   System.out.println("SUM is " + (a + b));
			   break;
			   
		   case '-' :
			   System.out.println("SUB is " + (a - b));
			   break;
			   
		   case '*' :
			   System.out.println("MUL is " + a * b);
			   break;
			   
		   case '/' :
			   System.out.println("DIV is " + a / b);
			   break;
			   
		   case '%' :
			   System.out.println("MOD is " + a % b);
			   break;
			   
		   default:
			   System.out.println("INVALID");
		   }
	}

}
