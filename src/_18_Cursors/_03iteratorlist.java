package _18_Cursors;
import java.util.*;
 

public class _03iteratorlist {
	public static void main(String [] arg)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<5;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		ListIterator<Integer> ll=list.listIterator();
		
		while(ll.hasNext())
		{
			Integer i=ll.next();
			System.out.println(i);
			switch(i)
			{
			case 1 :
			{
				ll.add(5);
				break;
			}
			case 2 :
			{
				ll.remove();
				break;
			}
			case 3:
			{
				ll.set(8);
				break;
			}
			 
			}
		}
		System.out.println(list);
	}

}
