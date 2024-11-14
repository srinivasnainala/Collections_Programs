package Collections1;

import java.util.*;

public class ArrayListStudentdemo {
public static void main(String[] args) {
//	TreeSet<StudentDetails> s=new TreeSet<>(Arrays.asList(
//	
//	new StudentDetails(2,"sai",23),
//	new StudentDetails(1,"sai",22),
//	new StudentDetails(1,"en",24)));
	ArrayList<StudentDetails> s7=new ArrayList<>(Arrays.asList(	
			new StudentDetails(1,"sai",22),
			new StudentDetails(2,"sai",23),
			new StudentDetails(1,"en",24)));
	        Collections.sort(s7);
//	Collections.sort(s7,(s1,s2)->
//	{
////		return s1.name.length()>s2.name.length()?-1:s1.name.length()<s2.name.length()?1:0;
//		return s1.age>s2.age?1:s1.age<s2.age?-1:0;
//	});
//	List<StudentDetails> s1=new ArrayList<>();
//	s1.add(new StudentDetails(1,"vsau",43));
//	s1.add(0,new StudentDetails(2,"sai",40));
//	System.out.println(s1.get(0));
//	for(int i=0;i<s7.size();i++)
//	{
//		System.out.println(s7.get(i));
//	}
//	Iterator<StudentDetails> i=s.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//	for(StudentDetails s3:s)
//	{
//		System.out.println(s3);
//	}
	
	for(StudentDetails s6:s7)
	{
		System.out.println(s6);
	}
}
}
