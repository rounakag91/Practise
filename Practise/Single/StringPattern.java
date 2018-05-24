package Single;


public class StringPattern {
	
	public static void main(String[] args)
	{
	String text = "Manger Id : mngr129320";
	String[] parts = text.split(": ");

	System.out.println(parts[1]);
	if(parts[1].matches("[mngr]{4}[0-9]*"))
		System.out.println("True");
	else
		System.out.println("False");
}}
