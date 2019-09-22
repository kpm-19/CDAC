package practice;

public class Font

{	
		String style;

		public Font(String style) throws IllegalValueException
		{
			super();
			this.style = style;
			
			if(style=="PLAIN" )
				System.out.println("plain text");
				
			else if(style=="BOLD")
				System.out.println("bold text");
			
			else if(style=="ITALIC")
				System.out.println("italic text");
			
			else 
				throw new IllegalValueException("type something else");
				
				
		}
		
		
}
