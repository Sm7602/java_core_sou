package _15_String;

import java.util.Scanner;

public class Problem_11 {
	public static String input()
	{
		Scanner sc= new Scanner(System.in);
		String  str;
		
		System.out.print("Enter :  ");
		str= sc.nextLine();
		
		return str;
	}
	public static void toMyUppercase(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch >='A'&&ch <='Z')
			{
				ch=(char)(ch+32);
			}
			System.out.print(ch);
		}
	
		
	}
	public static void main(String[] arg)
	{
		String str=input();
		toMyUppercase(str);

	}

}
