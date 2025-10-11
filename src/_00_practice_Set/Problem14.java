package _00_practice_Set;
/*
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 
 */

public class Problem14 {
	public static void main(String[] arg)
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=5-i;s>0;s--)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			 
			System.out.println();
		}
	}

}
