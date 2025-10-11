package _00_practice_Set;
//       1
//     1   1
//    1   2   1
//   1   3   3   1
//  1   4   6   4   1
//1   5   10   10   5   1

public class Problem10 {
	public static void main(String[] arg)
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5-i;j>0;j--)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(n+" ");
				 n = n * (i - k) / (k + 1);
			}
			System.out.println();
		}
	}

}
