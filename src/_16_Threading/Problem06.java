package _16_Threading;

//Write a Java program that performs matrix
//multiplication using multiple threads.

import java.util.Scanner;

class CreateMatrix1Thread implements Runnable
{
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];

	public void run()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print("Arr["+i+"]["+j+"] ");
				arr[i][j]=sc.nextInt();
			}
			System.out.println(); 
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
              System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		 
	}
}
public class Problem06 {
	public static void main(String []arg)
	{
		CreateMatrix1Thread m1=new CreateMatrix1Thread();
		Thread t1=new Thread(m1);
		
		CreateMatrix1Thread m2=new CreateMatrix1Thread();
		Thread t2=new Thread(m2);
		
		t1.start();
		try
		{
		t1.join();
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();
	}

}
