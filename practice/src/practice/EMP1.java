package practice;

/*Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt*/

class ttt
{
	private static int cnt=10;

	public static int getCnt() {
		return cnt;
	}

	
	
}

public class EMP1 {

	public static void main(String[] args) {
		//ttt e=new ttt();
		System.out.println(ttt.getCnt());

	}

}
