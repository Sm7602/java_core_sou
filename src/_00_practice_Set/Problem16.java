package _00_practice_Set;
//Write a Java Program to Compute the Sum of Array Elements.

public class Problem16 {
	public static void main(String[] arg)
	{
		int arr[]=new int[] {1,2,3,4,5};
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i];
		}
		
		System.out.println(sum);
	}

}
