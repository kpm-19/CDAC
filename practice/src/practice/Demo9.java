package practice;

/*create a hierarchy as follows
interface Game- play() method
Derive at least 3 classes from it.
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.*/

interface Game
{
	public void play();
	
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("play tennis");
	}
}

class Cricket implements Game
{
	public void play()
	{
		System.out.println("play cricket");
	}
}

class Football implements Game
{
	public void play()
	{
		System.out.println("play football");
	}
}

class hoop{
	public void play()
	{
		System.out.println("play hop");
	}
}

class Generic<T extends Game>
{
	public static void perform(Game ref)
	{
		ref.play();
	}
	/*T ob;
	public T disp()
	{
		System.out.println("hello");
		return null;
	}*/
	
}
public class Demo9 {

	public static void main(String[] args) {
		/*Generic<Cricket> generic=new Generic<Cricket>();
		Cricket cri =generic.disp();
		Generic<Football> generic1=new Generic<Football>();
		Football cri =generic1.disp();
		Generic<Cricket> generic=new Generic<Cricket>();
		Cricket cri =generic.disp();*/
		Generic.perform(new Football());
	}

}
