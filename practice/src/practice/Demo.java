package practice;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) 
	{
		Student s=new Student("A", 20,1);
		
		try(FileOutputStream fos=new FileOutputStream("D:\\kp.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(s);
			}
			
		} 
		catch (Exception e3) {
			
			e3.printStackTrace();
		}
		
		try(FileInputStream fis=new FileInputStream("D:\\kp.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				Student s1=(Student)ois.readObject();
				System.out.println(s1);
			}
			
		} 
		catch (Exception e1) {
			
			e1.printStackTrace();
		}
		
		

	}

}
