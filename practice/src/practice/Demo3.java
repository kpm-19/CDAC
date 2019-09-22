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

/*create a class MyNum with
private int num;
parameterized constructor


Demo class with main
create 4 objects of MyNum by passing different integers.
store these 4 objects inside "ArrayList"
and now store that ArrayList inside file system.

read ArrayList from file and traverse it using Iterator.*/

class MyNum implements Serializable
{
	private int num;

	public MyNum() {
		super();  }
	public MyNum(int num) {
		super();
		this.num = num;
	}
	@Override
	public String toString() {
		return "MyNum [num=" + num + "]";
	}
	
	
}

public class Demo3 {

	public static void main(String[] args) 
	{
		MyNum m1=new MyNum(5);
		MyNum m2=new MyNum(15);
		MyNum m3=new MyNum(25);
		MyNum m4=new MyNum(35);
		List<MyNum> l=new ArrayList<MyNum>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		
		try(FileOutputStream fos=new FileOutputStream("D://kv.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(l);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		List<MyNum> l1=null;
		try(FileInputStream fis=new FileInputStream("D://kv.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				 l1=(List<MyNum>)ois.readObject();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		Iterator<MyNum> it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
	}

}
