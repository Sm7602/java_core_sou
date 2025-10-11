package _00_practice_Set;
//Java Array Program For Array Rotation
public class Problem19 {
	public static void main(String [] arg)
	{
		int arr[]=new int[] {1,2,3,4,5,6};
		int d=3;
		
			for(int k=d;k<arr.length;k++)
			{
				System.out.print(arr[k]+",");
			}
			for(int l=0;l<d;l++)
			{
				System.out.print(arr[l]+",");
			}
		
	}

}
