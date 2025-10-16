package _18_Cursors;

import java.util.Vector;
import java.util.Enumeration;

public class _01Enumueration {
	public static void main(String[] arg)
	{
		Vector<Integer> list=new Vector<Integer>();
		
		for(int i=0;i<5;i++)
		{
			list.add(10+i);
		}
		System.out.println(list);
		
		Enumeration<Integer> Cursor=list.elements();
		
		while(Cursor.hasMoreElements())
		{
			Integer i=Cursor.nextElement();
			System.out.println(i);
		}
	}

}
