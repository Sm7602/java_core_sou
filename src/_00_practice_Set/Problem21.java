package _00_practice_Set;
//Java Array Program to Remove All
//Occurrences of an Element in an Array
public class Problem21 {
	public static void main(String[] arg)
	{
		int arr[]=new int [] {1,2,3,4,5,6,1,1};
		int n=2;
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>2)
			{
				continue;
			}
			else
			{
				System.out.print(arr[i]);
			}
		}
	}

}
