package _00_practice_Set;
//Write Java Program to Find the Tranpose of Matrix
public class Problem18 {
	public static void main(String[] arg)
	{
		int m[][]=new int[][]{ { 1, 2, 3, 4 },
                               { 5, 6, 7, 8 },
                               { 9, 10, 11, 12 },
                               { 13, 14, 16, 16 },
		                        };
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
	                System.out.print(m[j][i]+" ");
			}
			System.out.println();
		}
	}

}
