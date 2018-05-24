package InterfaceStarWars.practise;

public class Enemy implements Characters{
	
	//Can have own properties
	public String Weapon = "Light Saber";
	
	public Enemy() {}
	
	//implement all functions in Characters otherwise error as : The type Enemy must implement the inherited abstract method Characters.heal()
	public void attack()
	{
		System.out.println("The Enemy attacks YOU.");
	}

	public void heal()
	{
		System.out.println("The enemy heals himself.");
	}
	
	public String getWeapon()
	{
		return Weapon;
	}
	
	//Can have own methods
	public void weaponDraw()
	{
		System.out.println("Draw out weapon.");

	}
	
	
	
	
}
