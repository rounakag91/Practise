//https://www.hackerrank.com/challenges/30-sorting/tutorial

package Sorting.Example;

import static Sorting.Example.HairColor.*;

public class Person {

	HairColor hairColor = BLACK;

	public Person() {

	}

	public static void main(String args[]) {
		Person peterParker = new Person();
		
		//Alias
		Person spiderman = peterParker;

		peterParker.hairColor = PINK;

		System.out.println("Hair Color of Peter Parker : " + peterParker.hairColor);
		System.out.println("Hair Color of SpiderMan : " + spiderman.hairColor);
		System.out.println(peterParker.hairColor.getClass());
		System.out.println(peterParker.hairColor.getDeclaringClass());
	}

}
