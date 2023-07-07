package oops;

abstract class Shapes 
{
	
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	

}
class Rectangles extends Shapes
{
//	private int l;
//	private int b;
//	
//	public int getL() {
//		return l;
//	}
//	public void setL(int l) {
//		this.l = l;
//	}
//	public int getB() {
//		return b;
//	}
//	public void setB(int b) {
//		this.b = b;
//	}
	public void calculateArea()
	{
		System.out.println("Area of rectangle is: l*b");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of rectangle: 2(l+b)");
	}
	
}
class Circles extends Shapes
{
	public void calculateArea()
	{
		System.out.println("Area of circle is: πr^2 ");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of circle is: 2πr");
	}
	
}
class Triangles extends Shapes
{
	public void calculateArea()
	{
		System.out.println("Area of Triangle is: (lxb)/2");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of Triangle is: a+b+c ");
	}
	
}
class Shapes_Main
{
	public static void main(String[] args)
	{
		Rectangles k=new Rectangles();
		k.calculateArea();
		k.calculatePerimeter();
		
		Circles b=new Circles();
		b.calculateArea();
		b.calculatePerimeter();
		
		Triangles c=new Triangles();
		c.calculateArea();
		c.calculatePerimeter();
	
		
       
		
		
	}
}





