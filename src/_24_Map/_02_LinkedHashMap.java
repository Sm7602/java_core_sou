package _24_Map;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class _02_LinkedHashMap {
	public static void main(String[] arg)
	{
		HashMap<String,Integer> map=new LinkedHashMap<>();
		
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
