package Exceptions.Example;

public class ExceptionPractise {

public static void main (String args[]) {
	
	try {
		int[] a = new int[5];
		System.out.println("Element at 5 is" + a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception Thrown : " +e);
	}
	finally {
		System.out.println("Finally Finished Try-Catch");
	}
	
}

}
