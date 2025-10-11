package _07_loop;

public class Problem25 {
	public static void main(String[] arg)
	{
		//print
		/*
		   5
		   1
		   4
		   2
		   3
		   3
		   2
		   4
		   1
		   5
		 */
		
		int n=5;
		int i=1;
		
		do {
			System.out.println(n--);
			System.out.println(i);
			i++;
		}
		while(i <= 5);
	}

}
