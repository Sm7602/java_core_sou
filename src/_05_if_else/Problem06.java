package _05_if_else;

import java.util.Scanner;

public class Problem06 {
	      public static void main(String[] arg)
	      {
	    	  /*WAP to take value of length and breath of a rectangle 
	    	  form user and check it is square or not*/
	    	  
	    	  Scanner rec=new Scanner(System.in);
	    	  
	    	  System.out.print("Enter The Length Of Ractangle : ");
	    	  double length=rec.nextDouble();
	    	  
	    	  System.out.print("Enter The Breath Of Ractangle : ");
	    	  double breath=rec.nextDouble();
	    	  
	    	  System.out.println("The Length Of Ractangle : " + length);
	    	  System.out.println("The Breath Of Ractangle :" + breath);
	    	  
	    	  if(length==breath)
	    	  {
	    		  System.out.println("That Is a Square");
	    	  }
	    	  else 
	    	  {
	    		  System.out.println("That Is Not a Square");
	    	  }
	    	  
	      }

}
