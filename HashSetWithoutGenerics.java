package Collections1;

import java.util.*;

public class HashSetWithoutGenerics {
public static void main(String[] args) {
	HashSet s=new HashSet();
	s.add("vasu");
	s.add("sai");
	s.add(1);
	s.add(2);
	s.add("naveen");
	s.add(1);
	HashSet s1=new HashSet();
	s1.add("vasu");
	s1.add("sai");
	s1.add(1);
	s1.add(2);
	s1.add("nainala");
//	s.removeAll(s1);
	s.retainAll(s1);
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
