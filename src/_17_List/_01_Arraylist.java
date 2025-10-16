package _17_List;
import java.util.*;

public class _01_Arraylist {
	public static void main(String[] arg)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//for add element by value
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		System.out.println(list);
		//for add element by index value
		list.add(4,5);
		System.out.println(list);
		
		//for remove element by value
		list.remove(Integer.valueOf(1));
		System.out.println(list);
		//for remove element by index value
		list.remove(1);
		System.out.println(list);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		//for add all element
		list.addAll(list2);
		System.out.println(list);
		
		//for remove  all element
		list.removeAll(list2);
		System.out.println(list);
		
		//for size
		System.out.println("size of list1 "+list.size());
		System.out.println("size of list2 "+list2.size());
		 
		//for set value
		list.set(1, 3);
		System.out.println(list);
		
		//for sorting 
		list.sort(null);
		System.out.println(list);
		
		//for clear all element
		list.clear();
		System.out.println(list);

	}
}
