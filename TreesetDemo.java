package Collections1;

import java.util.*;

public class TreesetDemo {
public static void main(String[] args) {
	Set<Integer> s=new TreeSet<>();
	s.add(12);
	s.add(1);
	s.add(12);
	s.add(3);
	s.add(90);
	Iterator<Integer> i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
