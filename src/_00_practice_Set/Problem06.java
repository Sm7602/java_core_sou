package _00_practice_Set;
// Write a Java Program to convert
//Integer numbers and Binary numbers.

public class Problem06 {
	public static void main(String[] arg)
	{
		int n=9;
		int arr[]=new int[1000];
		int i=0;
		while(n>0)
		{
			arr[i]=n%2;
			n=n/2;
			i++;
		}
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
	}

}
