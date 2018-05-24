//https://www.hackerrank.com/challenges/30-interfaces/tutorial

package InterfaceStarWars.practise;

import java.util.Random;

public class StarWarsInterfacePractise {
	
	public static Characters summonCharacter()
	{
		Random rand = new Random();
		if(Math.abs(rand.nextInt()) % 2 == 0)
		{
			return new Enemy();
		}
		else
		{
			return new Hero();
		}
	}
	
	
	public static void main(String args[])
	{
		Enemy darthVader = new Enemy();
		Hero ObiWanKenobi = new Hero();
		darthVader.attack();
		ObiWanKenobi.attack();
		darthVader.heal();
		ObiWanKenobi.heal();
		System.out.println("Enemy weapon : "+ darthVader.getWeapon());
		System.out.println("Hero weapon : "+ ObiWanKenobi.getWeapon());
		
		Characters spy = summonCharacter();
		spy.attack();
		spy.heal();
		
		

	}

}
