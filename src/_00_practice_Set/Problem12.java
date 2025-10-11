package _00_practice_Set;
/*
    *
   ***
  *****
 *******
 */
public class Problem12 {
	public static void main(String[] arg)
	{
		for(int i=0;i<5;i++)
		{
			for(int s=5-i;s>0;s--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
