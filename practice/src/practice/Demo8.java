package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo8
{

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(001,"A","manageracct", 500.0);
		Employee1 e2 = new Employee1(002,"B","managerhead", 600.0);
		Employee1 e3 = new Employee1(003,"C","manager1", 700.0);
		Employee1 e4 = new Employee1(004,"D","manager3", 850.0);
		List<Employee1> l= new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		try(FileOutputStream fos=new FileOutputStream("qwe.txt"))
		{
			try(ObjectOutputStream oos = new ObjectOutputStream (fos))
			{
				oos.writeObject(l);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		List<Employee1> l1 =null;
		
		try(FileInputStream fis=new FileInputStream("qwe.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				l1=(List<Employee1>)ois.readObject();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Iterator<Employee1> it=l1.iterator();
		while(it.hasNext())
		{
			//Employee1 ref= (Employee1)it.next();
			//ref.disp();
			it.next().disp();
			//((Employee1) it.next()).disp();
		}

	}

}
