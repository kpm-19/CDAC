package practice;

public class IllegalValueException extends Exception
{
	public IllegalValueException(String string)
	{
		super(string);
		System.out.println(string);
	}
	
}
