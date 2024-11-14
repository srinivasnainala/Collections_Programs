package Collections1;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListWithoutGenerics {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add("vasu");
	l.add(1);
	l.add("naidu");
	l.add(2);
	l.add("vasu");
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
