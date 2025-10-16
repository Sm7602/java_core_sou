package _17_List;

//Write a Java program to insert
//an element into the array list at the first position.

import java.util.ArrayList;
public class Problem03 {

	public static void main(String[] arg)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(0,5);
		list.add(1,4);
		list.add(2,5);
		list.add(3,6);
		list.add(4,7);
		
		System.out.println(list);
		
	}
}
