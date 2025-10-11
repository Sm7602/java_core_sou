package _18_List;
//Write a Java program to create an 
//array list, add some colors (strings) and 
//print out the collection.

import java.util.ArrayList;

public class Problem01 {
	public static void main(String[] arg)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Blue");
		list.add("Yollow");
		
		System.out.println(list);
		
	}

}
