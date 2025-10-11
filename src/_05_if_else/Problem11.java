package _05_if_else;

import java.util.Scanner;

public class Problem11 {
	   public static void main(String[] arg)
	   {
		   //WAP to create a calculator
		   
		   Scanner cal =new Scanner(System.in);
		   
		   System.out.print("Enter frist val :");
		   int n1=cal.nextInt();
		   
		   System.out.print("Enter second val :");
		   int n2=cal.nextInt();
		   
		   System.out.print("Enter the op :");
		   char op=cal.next().charAt(0);
		   
		   if(op == '+')
		   {
			   System.out.println("The sum of two number :" +(n1+n2));
		   }
		   else if(op == '-')
		   {
			   System.out.println("The sub of two number :" +(n1-n2));
		   }
		   else if(op == '*')
		   {
			   System.out.println("The mul of two number :" +n1*n2);
		   }
		   else if(op == '/')
		   {
			   System.out.println("The sub of two number :" +n1/n2);
		   }
		   else if(op == '%')
		   {
			   System.out.println("The sub of two number :" +n1%n2);
		   }
		   else
		   {
			   System.out.println("INVALID!");
		   }
	   }

}
