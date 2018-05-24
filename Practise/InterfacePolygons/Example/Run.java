//https://www.hackerrank.com/challenges/30-interfaces/tutorial

package InterfacePolygons.Example;

public class Run {

	public static void print(Polygon p) {
		System.out.println("A " + p.getClass().getSimpleName() + " has " + p.getNumOfSides() + " sides.");
		System.out.println("The Perimeter of the " + p.getClass().getSimpleName() + " is : " + p.getPerimeter());
		System.out.println("The Area of the " + p.getClass().getSimpleName() + " is : " + p.getArea());
		System.out.println();

	}

	public static void main(String args[])
	{
		Polygon triangle = new Triangle(3, 4, 5);
		print(triangle);
		
		Polygon rect = new Rectangle(5,8);
		print(rect);
		
		Polygon sq = new Square(5);
		print(sq);
	}
}
