package _16_Exception_Handling;

//Write a Java program to create a method that takes a 
//string as input and throws an exception if the string does not contain vowels.

import java.util.Scanner;

class StringNotCantainVowelsException extends Exception
{
	public StringNotCantainVowelsException(String msg)
	{
		super(msg);
	}
}

public class Problem03 {
	
	public static String input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter : ");
		String str=sc.nextLine();
		return str;
	}
	public static void vowel()
	throws StringNotCantainVowelsException
	{
		String str=input();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c == 'a'||c =='e'||c =='i'||c == 'o'||c =='u'||c =='A'||c == 'E'||c =='I'||c =='O'||c == 'U')
			{
				System.out.println();
				throw new StringNotCantainVowelsException("string not cantians vowel...");
			}
			else
			{
				System.out.print(c);
			}
		}
		
	}
	
	public static void main(String [] arg)
	{
		try
		{
		vowel();
		}
		catch(StringNotCantainVowelsException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
