package _07_loop;

public class Problem16 {
	public static void main(String[] arg)
	{
		//WAP to print series
		/*
		   5
		   1
		   4
		   2
		   3
		   3
		   4
		   2
		   1
		   5
		 */
		
		int n=5;
		
		int i =1;	
		
		while(i <= 5)
		{
			System.out.println(n--);
			System.out.println(i);
			
			i++;
		}
	}
 
}
