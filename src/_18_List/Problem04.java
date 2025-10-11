package _18_List;
//Write a Java program to 
//reverse elements in an array list.
import java.util.*;
public class Problem04 {
	public static void main(String[] arg)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
		System.out.println(list1);
		
		Collections.reverse(list1);
		
		System.out.println(list1);
		
       ArrayList<String> list2=new ArrayList<String>();
		
		list2.add("kalu");
		list2.add("lalu");
		list2.add("polu");
		list2.add("molu");
		list2.add("lolu");
		
		System.out.println(list2);
		
		Collections.reverse(list2);
		
		System.out.println(list2);
		
	}

}
