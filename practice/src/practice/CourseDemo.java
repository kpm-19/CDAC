package practice;


interface Course
{
	public void start();
}

class Dac implements Course
{
	public void start()
	{
		System.out.println("doing Dac");
	}
}
class PgDbda implements Course
{
	public void start(){
		System.out.println("doing dbda");
	}
}

class MSCIT implements Course
{
	public void start()
	{
		System.out.println("doing mscit");
	}
}

public class CourseDemo 
{
	public static void perform (Course ref)
	{	
		if(ref instanceof Dac)
		    ref.start();
	}
	

	public static void main(String[] args)
	{
		Course[] arr=new Course[3];
		arr[0]=new Dac();
		arr[1]=new PgDbda();
		arr[2]=new MSCIT();
		for(int i=0;i<arr.length;i++)
		{
			perform(arr[i]);
		}
		

	}

}
