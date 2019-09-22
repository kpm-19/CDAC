package practice;
/*create a class "DemoArr",with the function "disp". create 4 objects of this class in an array.
Traverse the array and invoke "disp" on each objects.
*/

class DemoArr
{
	
	public void disp()
	{
		System.out.println("displaying");
	}
}
public class demo20 {

	public static void main(String[] args)
	
	{
		
			DemoArr [] arr =new DemoArr[4];
			//arr[0]=new DemoArr();
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=new DemoArr();
				arr[i].disp();
				
			}
	}

}
