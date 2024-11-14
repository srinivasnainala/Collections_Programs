package Collections1;

import java.util.*;

public class LinkedHashSetWithGenerics {
public static void main(String[] args) {
	LinkedHashSet<String> s=new LinkedHashSet<>();
	s.add("vasu");
	s.add("sai");
	s.add("naveen");
	s.add("vinay");
	s.add("ganesh");
	LinkedHashSet<Integer> s1=new LinkedHashSet<>();
	s1.add(32);
	s1.add(43);
	s1.add(10);
	s1.add(32);
	s1.add(98);
	Iterator<Integer> i1=s1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	Iterator<String> i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
