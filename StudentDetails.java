package Collections1;

public class StudentDetails implements Comparable<StudentDetails>
{
//public class StudentDetails {
	int id;
	String name;
    int age;
	
	public StudentDetails(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(StudentDetails s4) 
	{
		return this.age>s4.age?1:this.age<s4.age?-1:0;
	}
}
