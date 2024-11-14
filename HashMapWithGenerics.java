package Collections1;

import java.util.*;

public class HashMapWithGenerics {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();	
	hm.put(12,"vasu");
	hm.put(1, "naidu");
	hm.put(2, "naveen");
	hm.put(null, "nainala");
	HashMap<Integer,String> hm1=new HashMap<>();	
	hm1.put(12,"vasu");
	hm1.put(1, "naidu");
	hm1.put(32, "naveen");
	hm1.put(1, "nainala");
//	hm.remove(1);
//	for(Map.Entry m1:hm.entrySet())
//	{
//		System.out.println(m1.getKey()+" "+m1.getValue());
//	}
	
//	Set<Map.Entry<Integer,String>> s=hm.entrySet();
	for(Map.Entry<Integer, String> m1:hm.entrySet())
	{
//		int k=(int)m1.getKey();
//		String m=m1.getValue();
		System.out.println(m1.getValue() +" "+m1.getKey());
//		System.out.println(k+" "+m);
	}
	
//	Set<Integer> s1=hm.keySet();
//	for(int i:hm1.keySet())
//	{
//		System.out.println(i+" "+hm.get(i));
//	}
}
}
