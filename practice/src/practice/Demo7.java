package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Sachin Tendulkar".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.*/



public class Demo7 implements Serializable
{

	public static void main(String[] args) 
	{
		Map<String,String> m=new HashMap<>();
		m.put("1", "Sachin Tendulkar");
		m.put("2","Virat kohli");
		m.put("3", "M S Dhoni");
		m.put("4", "Dravid");
		m.put("5", "Gautam Gambhir");
		Set<Entry<String,String>> s= m.entrySet();
		Iterator<Entry<String,String>> it= s.iterator();
		System.out.println("RANK    NAME");
		while(it.hasNext())
		{
			Map.Entry<String,String> me= it.next();
			
			System.out.print(me.getKey() +"\t");
			System.out.println(me.getValue());
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RANK : ");
		String k =sc.next();
		
		System.out.println( "PLAYER NAME : " + m.get(k));
		
		try(FileOutputStream fos= new FileOutputStream("D://tyu.txt"))
		{
			try( ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
				oos.writeObject(m);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		
		Map<String,String> m1= null;
		try(FileInputStream fis= new FileInputStream("D://tyu.txt"))
		{
			try(ObjectInputStream ois= new ObjectInputStream(fis))
			{
				m1= (Map<String,String>) ois.readObject();
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		} 		
		Set<Entry<String,String>> s1= ((Map<String, String>) m1).entrySet();
		Iterator <Entry<String,String>> it1 = s1.iterator();
		System.out.println("RANK     NAME");
		while(it1.hasNext())
		{
			Map.Entry<String,String> me1= (Entry<String,String>)it1.next();
			
			
			System.out.print(me1.getKey() +"\t"  );
			System.out.println(me1.getValue());
			
		}
		
		
		
		
	}

}
	