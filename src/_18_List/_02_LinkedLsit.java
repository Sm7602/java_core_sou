package _18_List;
import java.util.LinkedList;
import java.util.Iterator;

public class _02_LinkedLsit {
	public static void main(String [ ] arg)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		
		 
		for(int i=1;i<=10;i++)
		{
		list.add(i);
		}
	
		System.out.println(list);
		
	   
		list.addFirst(11);
	    System.out.println(list);
	    
	    list.addLast(01);
	    System.out.println(list);
	    
	    list.removeFirst();
	    System.out.println(list);
	    
	    list.removeLast();
	    System.out.println(list);
	    
	    list.add(5,2);
	    list.addLast(2);
	    System.out.println(list);
	    
	    list.removeFirstOccurrence(2);
	    list.removeLastOccurrence(2);
	    System.out.println(list);
	    
	    list.sort(null);
	    System.out.println(list);
	    
	    Iterator<Integer> ll=list.iterator();
	    
	    while(ll.hasNext())
	    {
	      	Integer i=ll.next();
	    	    System.out.println(i);
	    }
	    
	    Iterator<Integer> ll2=list.descendingIterator();
	    while(ll2.hasNext())
	    {
	      	Integer i=ll2.next();
	    	    System.out.println(i);
	    }
	}

}
