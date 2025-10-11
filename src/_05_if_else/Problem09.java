package _05_if_else;

import java.util.Scanner;

public class Problem09 {
	    public static void main(String[] arg)
	    {
	    	//WAP to input from user any char and check it is vowel or consonant
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("Enter a character : ");
	    	char c=sc.next().charAt(0);
	    	
	    	//if and logical or operator are always give boolean value
	    	
	    	if(c == 'a'||c =='e'||c =='i'||c == 'o'||c =='u'||c =='A'||c == 'E'||c =='I'||c =='O'||c == 'U')
	    	{
	    		System.out.println(c + " THAT IS VOWEL");
	    	}
	    	else 
	    	{
	    	   System.out.println(c + " THAT IS CONSONANT");
	    	}
	    	
	    }

}
