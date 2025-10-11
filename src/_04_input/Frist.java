package _04_input;

import java.util.Scanner;

public class Frist {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		//create the object
		
		System.out.print("Enter the int value :");
		int i= sc.nextInt();
		//for Int value
		

		System.out.print("Enter the char value :");
		char c= sc.next().charAt(0);
		//for char value
		
		System.out.print("Enter the float value :");
		float f= sc.nextFloat();
		//for float value
		
		System.out.print("Enter the short value :");
		short sh= sc.nextShort();
		//for short value
		
		System.out.print("Enter the long value :");
		long l= sc.nextLong();
		//for long value
		
		System.out.print("Enter the byte value :");
		byte b= sc.nextByte();
		//for byte value
		
		System.out.print("Enter the double value :");
		double d=sc.nextDouble();
		//for double value
		
		System.out.print("Enter the booloan value :");
		boolean bo=sc.nextBoolean();
		
		
		System.out.println("-------OUTPUT-------");
		System.out.println("The int value :" +i);
		System.out.println("The char value :" +c);
		System.out.println("The float value :" +f);
		System.out.println("The short value :" +sh);
		System.out.println("The long value :" +l);
		System.out.println("The byte value :" +b);
		System.out.println("The double value :" +d);
		System.out.println("The booloan value :" +bo);
		

		
		}
}

  