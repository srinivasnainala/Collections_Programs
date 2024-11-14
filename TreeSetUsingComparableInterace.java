package Collections1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class Employee1 implements Comparable<Employee1>
{
   int id;
   String name;
   int age;
   long Mobile;
   
	public Employee1(int id, String name, int age, long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.Mobile = mobile;
	}
//	@Override
//	public String toString() {
//		return "Employee id " + id + ", name " + name + ", age " + age + ", Mobile " + Mobile + "]";
//	}
	public int compareTo(Employee1 s4) 
	{
//		return this.name.length()>s4.name.length()?1:this.name.length()<s4.name.length()?-1:0;
//		return this.id>s4.id?1:this.id<s4.id?-1:0;
		return this.name.compareTo(s4.name);
	}
     
}
public class TreeSetUsingComparableInterace {
public static void main(String[] args) {
	Set<Employee1> s=new TreeSet<>(Arrays.asList(
			new Employee1(243,"ai",23,234264843),
			new Employee1(1,"sai",22,234326478),
			new Employee1(1,"zen",24,898904562)));
		for(Employee1 e:s)
		{
			System.out.println(e.id+" "+e.name+" "+e.age+" "+e.Mobile);
		}
//	TreeSet<Employee1> s5=new TreeSet<>(Arrays.asList(
//			new Employee1(3,"sai",23,234264843),
//			new Employee1(12,"sai",22,234326478),
//			new Employee1(123,"en",24,898904562)));
//		for(Employee1 e:s5)
//		{
//			System.out.println(e);
//		}
}
}
