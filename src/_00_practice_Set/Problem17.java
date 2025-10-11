package _00_practice_Set;
//Write a Java Program to Find the Largest Element in Array
public class Problem17 {
	public static void main(String[] arg)
	{
		int arr[]=new int[] {2,5,6,7,2,11};
		int larg=arr[0];
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]>larg)
				{
					larg=arr[i];
				}
		}
		
		System.out.print(larg);
	}

}
