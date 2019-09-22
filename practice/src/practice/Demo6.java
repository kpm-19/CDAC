package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.*/





public class Demo6 {

	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(001,"A");
		m.put(002,"V");
		m.put(003,"K");
		m.put(004,"O");
		m.put(005,"Y");
		m.put(006,"D");
		m.put(007,"E");
		
		Set<Entry<Integer,String>> s=m.entrySet();
		Iterator<Entry<Integer,String>> it= s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> me = (Entry<Integer,String>)it.next();
			//System.out.print(me.getKey() + "\t");
			//System.out.println(me.getValue());
			
		}
		System.out.println(m);
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		
		System.out.println(m.get(k));
		
		
		
		
		

	}

}
