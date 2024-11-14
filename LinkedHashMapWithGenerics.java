package Collections1;

import java.util.*;

public class LinkedHashMapWithGenerics {
public static void main(String[] args) {
	Map<Integer,String> m=new LinkedHashMap<>();
	m.put(12, null);
	m.put(null, "vasu");
	m.put(32, "naveen");
	m.put(12, "sai");
	Set<Map.Entry<Integer, String>> s=m.entrySet();
	for(Map.Entry<Integer, String> m1:s)
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}
	
//	Iterator<Map.Entry<Integer,String>> i=s.iterator();
//	while(i.hasNext())
//	{
//		Map.Entry<Integer, String> m1=(Map.Entry<Integer, String>)i.next();
//		 System.out.println(m1);
//	}
}
}
