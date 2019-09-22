package practice;

import java.io.Serializable;

/*Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.*/

public class Employee1 implements Serializable
{
int empid;
String empname;
String desig;
double basic;
public Employee1(int empid, String empname, String desig, double basic) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.desig = desig;
	this.basic = basic;
}






/*@Override
public String toString() {
	return "Employee1 [empid=" + empid + ", empname=" + empname + ", desig=" + desig + ", basic=" + basic + "]";
}*/






public void disp() {
	System.out.println("Empid : "+ empid + "Empname : " + empname + "Designation : " + desig + "Salary : "
			+ basic);
	
}

}
