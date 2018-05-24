package Single;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryAndMap {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> hp = new HashMap<String, Integer>();

		for(int i=0; i<n; i++)
		{
			String name = sc.next();
			int number = sc.nextInt();
			hp.put(name, number);
			
		}
		while(sc.hasNext())
		{
			String s = sc.next();
			if(hp.containsKey(s))
			{
				System.out.println(hp.get(s));
			}
			else
				System.out.println("Not found");
		}
		sc.close();
	}

}
