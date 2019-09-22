package practice;

import java.io.Serializable;

/*Person class implements Serializable with
private String name
private int age

	getters and setters
	parameterized constructor

Student extends Person
private int rollno
	getter and setters
	parameterized constructor accepting name,age and rollno
		pass name and age to the super constructor


Demo class with main
create one object of Student, write it inside file and then read.*/

 class Person implements Serializable
{
   private String name;
   private int age;
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
   
}
 
class Student extends Person
{
    private int rollno;

	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String toString()
	   {
		   return "name"+ "\t" +getName() +"   age="+ "\t"+ getAge()+ "  rollno" +"\t"+ getRollno();
	   }
	   

	
}
