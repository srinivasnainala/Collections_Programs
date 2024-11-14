package Collections1;

import java.util.*;

public class ArrayListWithGenerics {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("vinay");
	al.add("sai");
	al.add(1,"naveen");
	al.add("vasu");
	al.add("Likitha");
	ListIterator<String> i=al.listIterator();
//	Iterator<String> i=al.iterator();
	while(i.hasNext())
	{
		i.next();
	}
	System.out.println();
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
}
}
