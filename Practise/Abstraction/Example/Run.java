package Abstraction.Example;


public class Run {

	public static void main(String args[])
	{
		
	//	Canine myPuppy = new Canine("Lilah", "Grey/White", 5, 'F');
		
		/*results in error: Canine is abstract; cannot be instantiated. 
		 * This type of class is only meant to serve as a base or blueprint for
		 * connecting the subclasses that inherit (extend) it. While we can't instantiate 
		 * Canine, we can instantiate its subclasses, KleeKai and SiberianHusky. This code: 
		*/
		
		Canine c = new KleeKai("Lilah", "Grey/White", 8, 'F');
		Canine d = new SiberianHusky("Alaska", "Grey/Black/White", 16, 'F');
		c.printInfo();
		d.printInfo();	
		
	}
	
}
