//https://www.hackerrank.com/challenges/30-more-exceptions/tutorial

package Exceptions.Example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HotChocolate {

	public static double tooHot = 185;
	public static double tooCold = 160;

	public static void drinkHotChoco(double cocoTemp) throws TooHotException, TooColdException {
		if (cocoTemp >= tooHot)
			throw new TooHotException();
		else if (cocoTemp <= tooCold)
			throw new TooColdException();
	}

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Current Coco Temperature : ");
		double currentTemp = sc.nextDouble();
		sc.close();
		boolean wrongTemp = true;

		while (wrongTemp) {
			try {
				drinkHotChoco(currentTemp);
				System.out.println("That Coco was good.");
				wrongTemp = false;
			} catch (TooHotException e1) {
				System.out.println("That's too Hot!");
				currentTemp -= 5; 
			} catch (TooColdException e2) {
				System.out.println("That's so cold!");
				currentTemp += 5;
			}
			TimeUnit.SECONDS.sleep(2);
		}
		System.out.println("And its gone.");

	}

}
