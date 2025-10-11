package _17_Threading;

//Write a Java program that sorts an array of 
//integers using multiple threads.

import java.util.Scanner;
class createArrThread implements Runnable
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[10];
	public void run()
	{
		System.out.println("Enter ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	} 
	public void sortArr()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			if(arr[j] > arr[j+1])
			{
				int temp=0;
				 if(arr[j]>arr[j+1])
			       {
			    	temp=arr[j];
			    	arr[j]=arr[j+1];
			    	arr[j+1]=temp;
			       }
			}
		}
	}
	public void print()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			try
			{
			Thread.sleep(2000);
			}
			catch( InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}



public class Problem04 {
	
	public static void main(String [] arg)
	{
		createArrThread arr=new createArrThread();
		Thread t1=new Thread(arr);
		 
		 
		t1.start();
		try
		{
		t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		arr.sortArr();
		arr.print();
	 
	     
		
	}
}
