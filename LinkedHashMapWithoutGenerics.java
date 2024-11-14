package Collections1;

import java.util.*;

public class LinkedHashMapWithoutGenerics {
public static void main(String[] args) {
	Map<Integer,String> m=new LinkedHashMap<>();
	m.put(23, "vasu");
	m.put(null, "sai");
	m.put(21, "naveen");
	m.put(1,"vinay");
	
	Map<Integer,String> m2=new LinkedHashMap<>();
	m2.put(64, "vasu");
	m2.put(null, "sai");
	m2.put(45, "naveen");
	m2.put(93,"vinay");
	m2.replace(23, "nasvdsdf");
    m2.putAll(m);
    Map<String,Integer> m3=new LinkedHashMap<>();
    m3.put("vsau", 1);
    m3.put("sai",5);
    m3.put("asdf",3);
    Set<String> s4=m3.keySet();
    for(String s5:s4)
    {
    	System.out.println(s5+" "+m3.get(s5));
    }
//    for(Map.Entry m1:m.entrySet())
//    {
//    	System.out.println(m1.getKey()+" "+m1.getValue());
//    }
//    for(int j:m.keySet())
//    {
//    	System.out.println(j+" "+m.get(j));
//    }
//	Set s=m2.entrySet();
//	Iterator i=s.iterator();
//	while(i.hasNext())
//	{
//		Map.Entry m1=(Map.Entry)i.next();
//		System.out.println(m1);
////		System.out.println(i.next());
//	}
    
    
//	Set s1=m.entrySet();
//	Iterator i1=s.iterator();
//	while(i1.hasNext())
//	{
//		Map.Entry m1=(Map.Entry)i1.next();
//		System.out.println(m1);
//////		System.out.println(i.next());
//	}
}
}
