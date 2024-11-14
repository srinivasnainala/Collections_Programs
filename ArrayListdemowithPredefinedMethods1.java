package Collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemowithPredefinedMethods1 {
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
	al.removeAll(al1);
	al.retainAll(al1);
//	System.out.println(al.retainAll(al1));
//	al.remove(1);
	Iterator<String> i=al.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
