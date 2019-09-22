package practice;

import java.util.HashMap;
import java.util.Map;

class Emp
{
	int empid;
	String name;
	int deptcode;
	public Emp(int empid, String name, int deptcode) {
		super();
		this.empid = empid;
		this.name = name;
		this.deptcode = deptcode;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", deptcode=" + deptcode + "]";
	}
	
}
public class Demo15 {

	public static void main(String[] args) 
	{
		 Emp e1=new Emp(1,"A",10);
		 Emp e2=new Emp(2,"B",30);
		 Emp e3=new Emp(3,"C",20);
		 
		 Map<Emp,String> m=new HashMap<>();
		 m.put(e1,"First");
		 m.put(e2,"Second");
		 m.put(e3,"Third");
		 System.out.println(m);
		 
		 // s1=m.get(e2);
		 System.out.println(m.get(e1));
		 

		 

	}

}
