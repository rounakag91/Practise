package scope;

import java.util.Arrays;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
		this.elements = a;
	}

	public void computeDifference() {
		// TODO Auto-generated method stub
/*		int len = elements.length;
		int diff;
		maximumDifference = 0;
		for (int i =0; i<len-1; i++)
		{
			for(int j =i; j<len; j++)
			{
			diff = Math.abs(elements[i] - elements[j]);
			if(diff>maximumDifference)
			{
				maximumDifference = diff;
			}
		}
		}*/
	//	OR
/*		int min = 100, max =1;// set max/min to its minimum/maximum possible value set by Constraints
		for(int element : elements)
		{
			if(min>element)
				min = element;
			if(max<element)
				max = element;
		}
		
		this.maximumDifference = max - min;*/
		//OR
		
		Arrays.sort(elements);
		this.maximumDifference = Math.abs(elements[elements.length -1] - elements[0]);
		
		
		
	}

}
