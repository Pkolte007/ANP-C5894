package oops;

class Shape
{
	String name;
	public void calculateArea() 
	{
	System.out.println("Calculating area of Shape");
	}

}

class Rectangle extends Shape
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle");
	}
}
class ShapeMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Rectangle d=new Rectangle();
		//access fields and methods
		//access fields and methods
				d.calculateArea();
			}

}

