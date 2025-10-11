package _23_Set;

import java.util.TreeSet;
 

public class _03_TreeSet {
	public static void main(String [] arg)
	{
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("abhsg");
		set.add("jahgsg");
		set.add("jjsgyyy");
		set.add("ursdhv");
		set.add("jdhfyjhrc");
		set.add("hsdyub f");
		
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		TreeSet<String> set2=new TreeSet<String>();
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
