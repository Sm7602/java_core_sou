package _18_List;
import java.util.*;
public class Problem08 {
	public static void main(String [] arg)
	{
		LinkedList<Integer> l1=new LinkedList<>();
		l1.add(4);
		l1.add(6);
		l1.add(5);
		
		LinkedList<Integer> l2=new LinkedList<>();
		l2.add(2);
		l2.add(4);
		l2.add(2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		Iterator<Integer> list1=l1.iterator();
		Iterator<Integer> list2=l2.iterator();
		
		while(list1.hasNext() && list2.hasNext() )
		{
			Integer i=list1.next();
			Integer j=list2.next();
			System.out.println(i+j);
		}
		
		
	}

}
