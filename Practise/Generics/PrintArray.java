package Generics;

public class PrintArray<T> {

	public static <T> void printArray(T[] t)
	{
		int size = t.length;
		for(T i : t)
		{
			System.out.print(i);
		}
	}
}
