package _17_List;
import java.util.Vector;

public class _03_Vector {
	public static void main(String[] arg)
	{
		Vector<Integer> v=new Vector<Integer>();
		
		//for add
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		
		System.out.println(v);
		
		//for remove by value
		v.removeElement(3);
		System.out.println(v);
		
		//for remove by index
		v.removeElementAt(3);
		System.out.println(v);
		
		//for remove all element in vactor
		v.removeAllElements();
		System.out.println(v);
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		System.out.println(v);
		
		//for get fast value
		System.out.println(v.firstElement());
		
		//for get last value
		System.out.println(v.lastElement());
		
	}

}
