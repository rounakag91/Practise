package Generics.Example;

public class GenericsPractise implements Comparable {

	public static <T extends Comparable<T>> T findMax(T a, T b, T c)
	{
		T max = a;
		if(b.compareTo(max)>0)
			max=b;
		if(c.compareTo(max)>0)
			max=c;
		return max;
	}
	
	public static void main(String args[])
	{
		//int
		System.out.println(findMax(1,3,5));
		
		//double
		System.out.println(findMax(3.0,6.0,53.2));
		
		//char
		System.out.println(findMax('a','f','c'));
		
		//String
		System.out.println(findMax("orange", "mango", "apple"));
		
		
		//DataType without compareTo method.
		//implement COmparable in class
		GenericsPractise k = new GenericsPractise();
		System.out.println(findMax(k,k,k));
		
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Method not Supported");
	}

}
