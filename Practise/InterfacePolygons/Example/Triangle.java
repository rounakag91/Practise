package InterfacePolygons.Example;

public class Triangle implements Polygon{

	public static int numOfSides = 3;
	public double side1, side2, side3;
	
	public Triangle(double side1, double side2, double side3) {
		// TODO Auto-generated constructor stub
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	@Override
	public int getNumOfSides() {
		// TODO Auto-generated method stub
		return numOfSides;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		
		return (int) (side1+side2+side3);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
