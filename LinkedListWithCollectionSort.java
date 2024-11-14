package Collections1;

import java.util.Arrays;
import java.util.*;

class Student 
{
	int id;
	String name;
	int age;
	int Mobile;
	public Student(int id, String name, int age, int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.Mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", Mobile=" + Mobile + "]";
	}
}
public class LinkedListWithCollectionSort {
public static void main(String[] args) {
	LinkedList<Student> s=new LinkedList<>(Arrays.asList(
			new Student(32,"vasu",22,28979803),
			new Student(12,"sai",23,88973291),
			new Student(19,"naveen",24,99125321)));
	Collections.sort(s,(s1,s2)->
	{
		return s1.id>s2.id?1:s1.id<s2.id?-1:0;
	});
	 for(Student s1:s)
	 {
		 System.out.println(s1);
	 }
}
}
