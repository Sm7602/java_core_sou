package _00_practice_Set;
//Java Array Program to Remove Duplicate Elements From an Array
public class Problem20 {
	public static void main(String[] arg)
	{
		int arr[]=new int[] {1,2,3,4,2,45,5,6,1};
		
		for(int i=0;i<arr.length;i++)
		{
			int c=0;
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{
				c++;
			}
			}
			if(c==1)
			{
				System.out.print(arr[i]);
			}
		}
	}

}
