package Collections1;

import java.util.*;

public class HashMapDemo123 {
public static void main(String[] args) {
	HashMap<Integer,String> m=new HashMap<>();
	m.put(1,"vasu");
	m.put(2, null);
	m.put(1,"sai");
	m.put(4, "vasu");
	Set s=m.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext())
	{
//		Map.Entry m1=(Map.Entry)i.next();
		System.out.println(i.next());
	}
}
}
