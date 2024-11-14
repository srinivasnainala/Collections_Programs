package Collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListWithoutGenerics {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("a");
	l.add(1);
	l.add("b");
	l.add(2);
	l.add("c");
	l.add(3);
	ListIterator i=l.listIterator();
//	Iterator i=l.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println();
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
}
}
