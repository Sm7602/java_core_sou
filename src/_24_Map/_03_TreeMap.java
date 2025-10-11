package _24_Map;

import java.util.TreeMap;

public class _03_TreeMap {
	public static void main(String[] arg)
	{
		TreeMap<String,Integer> map=new TreeMap<>();
		
		map.put("lala",8);
		map.put("kala",8);
		map.put("sala",8);
		map.put("mala",8);
		map.put("nala",8);
		
		System.out.println(map);
		
		map.remove("lala",8);
		System.out.println(map);
	}

}
