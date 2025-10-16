package _17_List;
//Write a Java program to iterate through all
//elements in an array list.
import java.util.ArrayList;
public class Problem02 {
	public static void main(String[] arg)
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("kalu");
		list.add("lalu");
		list.add("valu");
		list.add("palu");
		
		for(String el : list)
		{
			System.out.println(el);
		}
		
	}
}
