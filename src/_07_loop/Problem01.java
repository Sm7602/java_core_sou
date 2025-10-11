package _07_loop;

public class Problem01 {
	public static void main(String[] arg)
	{
		for(int i=0;i<11;i++)
		{ //WAP to print pattern
		  /*
		    1
			0
			1
			0
			1
			0
			1
			0
			1
			0
			1
			*/
			if(i % 2 ==0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}

}
