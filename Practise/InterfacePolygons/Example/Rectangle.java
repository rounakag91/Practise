package InterfacePolygons.Example;

public class Rectangle implements Polygon {
	
	public static int numOfSides = 4;
	public double length;
	public double breadth;
	
	public Rectangle(double length, double breadth) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public int getNumOfSides() {
		// TODO Auto-generated method stub
		return numOfSides;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return (int) (2*(length+breadth));
	}
	
	public double getArea()
	{
		return (length*breadth);
	}

}
