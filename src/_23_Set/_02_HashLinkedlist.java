package _23_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _02_HashLinkedlist {
	public static void main(String [] arg)
	{
		HashSet<String> set=new  LinkedHashSet<String>();
		
		set.add("abhsg");
		set.add("jahgsg");
		set.add("jjsgyyy");
		set.add("ursdhv");
		set.add("jdhfyjhrc");
		set.add("hsdyub f");
		
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		HashSet<String> set2=new LinkedHashSet<String>();
		set2.add("kalu");
		set2.add("lalu");
		set2.add("malu");
		set2.add("chalu");
		set2.add("loru");
		set2.add("muku");
		
		set.addAll(set2);
		System.out.println(set);
		
	}


}
