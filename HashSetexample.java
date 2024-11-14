package Collections1;

import java.util.*;

public class HashSetexample {
public static void main(String[] args) {
	HashSet<StudentDetails> h=new HashSet<>();
	StudentDetails s=new StudentDetails(1,"vasu",22);
	h.add(new StudentDetails(1,"vasu",22));
	h.add(new StudentDetails(1,"vasu",22));
	for(StudentDetails s1:h)
	{
		System.out.println(s1);
	}
}
}
