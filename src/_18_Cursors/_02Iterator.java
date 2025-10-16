package _18_Cursors;
import java.util.ArrayList;
import java.util.Iterator;

public class _02Iterator {
	public static void main(String [] arg)
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<5;i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		Iterator<Integer> cursor=list.iterator();
		
		while(cursor.hasNext())
		{
			Integer i=cursor.next();
			System.out.println(i);
			
			if(i == 2 )
			{
				cursor.remove();
			}
		}
		
		System.out.println(list);
	}

}
