package InterfaceStarWars.practise;

public class Hero implements Characters {

	//can have same as in Enemy 
	
	public String Weapon = "The Force";
	
	
	public void attack() {
		System.out.println("hero attacks the enemy.");
	}
	
	public void heal()
	{
		System.out.println("The hero heals you.");
	}
	
	public String getWeapon()
	{
		return Weapon;
	}
	
}
