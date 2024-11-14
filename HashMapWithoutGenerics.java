package Collections1;

import java.util.*;
import java.util.Map.Entry;

public class HashMapWithoutGenerics {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();	
	hm.put(2,"sai");
	hm.put(3,"sai");
	hm.put(4,"naveen");
	hm.put(null,"vinay");
	hm.put(1,"vasu");
	Set s=hm.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		Map.Entry m=(Map.Entry) i.next();
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}
