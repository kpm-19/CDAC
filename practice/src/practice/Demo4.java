package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*class Employee
private int empid
private String name,desig
private double salary

parameterized constructor
toString method


create 4 objects of Employee
create an arraylist of Employee and store these 4 objects.
create an iterator and traverse throught the arraylist

now store this arraylist inside filesytem and also read.*/

class Employee implements Serializable
{
	private int empid;
	private String name;
	private String desig;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empid, String name, String desig, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	
	
	
}
public class Demo4 
{

	public static void main(String[] args)
	{
			Employee e1=new Employee(001,"aniket","manager",50000);
			Employee e2=new Employee(002,"leo","ceo",60000);
			Employee e3=new Employee(003,"tarun","acctountant",70000);
			Employee e4=new Employee(004,"akshay","analyst",90000);
			List<Employee> l=new ArrayList<Employee>();
			l.add(e1);
			l.add(e2);
			l.add(e3);
			l.add(e4);
			
			System.out.println(l);
			Iterator<Employee> it=l.iterator();
			System.out.println("at the time of writing");
			while(it.hasNext())
			{	
				System.out.println(it.next());
			}
			try(FileOutputStream fos=new FileOutputStream("D://vk.txt"))
			{
				try(ObjectOutputStream oos=new ObjectOutputStream(fos))
				{
					oos.writeObject(l);
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			List <Employee> l1=null;
			try(FileInputStream fis=new FileInputStream("D://vk.txt"))
			{
				try(ObjectInputStream ois=new ObjectInputStream(fis))
				{
					l1=(List<Employee>)ois.readObject();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			Iterator<?> itr=l1.iterator();
			System.out.println("at the time of reading");
			while(itr.hasNext())
			{	
				System.out.println(itr.next());
			}
			
	}

}
