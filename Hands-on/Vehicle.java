package oops;

class Vehicle 
{
  String brand;
  int year;
  public void displayinfo() 
	{
	System.out.println("Brand and year of the vehicle");
    }
	
}
class Car extends Vehicle
{
	  String model;
	  //public void displayinfo() 
	   {
		System.out.println("Brand and year of the vehicle");
	   }
}
class Sportscar extends Car
{
	  int topspeed;
	  public void displayinfo() 
	   {
		System.out.println("Brand, year, model and top speed of the sports car");
	   }
}
class VehicleMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Sportscar d=new Sportscar();
		//access fields and methods
		//access fields and methods
				d.brand="BMW";
				d.model="X7";
				d.year=2022;
				d.topspeed=180;
				System.out.println("Brand name is " + d.brand);
				System.out.println("Model name is " + d.model);
				System.out.println("Year " + d.year);
				System.out.println("top speed " + d.topspeed);
	}
	
	
	
	
	
			

}

