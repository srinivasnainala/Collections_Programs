package Collections1;

import java.util.*;

public class ArrayListdemowithPredefinedMethods {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("vasu");
	al.add("sai");
	al.add("naveen");
	al.add("vinay");
	ArrayList<String> al1=new ArrayList<>();
	al1.add("vinay");
	al1.add("naidu");
	al1.add("naveen");
//	al.removeAll(al1);
	al.retainAll(al1);
	for(String s:al)
	{
		System.out.println(s);
	}
//	Iterator<String> i=al.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
}
}
