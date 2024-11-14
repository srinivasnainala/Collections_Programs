package Collections1;

import java.util.Arrays;
import java.util.*;

//class Location
class Location implements Comparable<Location>
 {
	 String State;
	 String District;
	 String Mandal;
	 String Village;
	public Location(String state, String district, String mandal, String village) 
	{
		super();
		this.State = state;
		this.District = district;
		this.Mandal = mandal;
		this.Village = village;
	}
	@Override
	public String toString() {
		return "Location [State=" + State + ", District=" + District + ", Mandal=" + Mandal + ", Village=" + Village
				+ "]";
	}
	@Override
	public int compareTo(Location l1) 
	{
	return this.Village.length()>l1.Village.length()?1:this.Village.length()<l1.Village.length()?-1:0;
	}
	
 }
public class HashSetWithComparableInterface {
public static void main(String[] args) {
	Set<Location> l=new TreeSet<>(Arrays.asList(
			new Location("AndhraPradesh","EastGodavari","Mamidikuduru","Pasarlapudi"),
			new Location("AndhraPradesh","EastGodavari","Razole","Jagannpeta"),
			new Location("AndhraPradesh","EastGodavari","Mamidikuduru","Pasarlapudi"),
			new Location("AndhraPradesh","EastGodavari","Amalapuram","peruru")));
	for(Location l2:l)
	{
		System.out.println(l2);
	}
}
}
