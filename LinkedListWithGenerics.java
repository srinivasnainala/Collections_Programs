package Collections1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListWithGenerics {
public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<>();
	l.add(4);
	l.add(2);
	l.add(3);
	l.add(5);
	Collections.sort(l);
	LinkedList<String> l1=new LinkedList<>();
	l1.add("vasu");
	l1.add("sai");
	l1.add("vinay");
	l1.addFirst("naveen");

	ListIterator<Integer> i=l.listIterator();
//	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println();
//	while(i.hasPrevious())
//	{
//		System.out.println(i.previous());
//	}
}
}
