package Single;

public class StringEquals {
	
	public static void main (String args[])
	{
		equalsSign();
		equalsKeyword();
		}
		
	public static void equalsSign() {
		String myString = "Marry";

     String yourString = "Marry";

     if (myString == yourString) {

            System.out.println("EQUAL");
     }
     else
     {
    	 System.out.println("NOT EQUAL");
     }
	}
     
     public static void equalsKeyword() {
    StringBuilder myString = new StringBuilder("Marry");

      StringBuilder yourString = new StringBuilder("Marry");

      if (myString == yourString) {

             System.out.println("EQUAL");

      }

}}
