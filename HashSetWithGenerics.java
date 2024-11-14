package Collections1;

import java.util.*;

public class HashSetWithGenerics {
public static void main(String[] args) {
	Set<String> s=new HashSet<String>();
	s.add("vasu");
	s.add("naveen");
	s.add("nainala");
    s.add("nijh");
	s.add("vasu");
	Set<Integer> s1=new HashSet<Integer>();
	s1.add(1);
	s1.add(98);
	s1.add(32);
    s1.add(32);
	s1.add(21);
    
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
