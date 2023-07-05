package oops;

//Example of Multilevel inheritance
//super class or base class or parent class
class Animal1 
{
//fields & methods
	String name;
	public void eat()
	{
		System.out.println("Animal Eat....");
	}
}
//inherit from Animal
class Dog1 extends Animal1
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	public void sound()
	{
		System.out.println("Dog Barks....");
	}
}
class Puppy extends Dog1
{
	//fields & methods of Animal class
	//fields & methods of Dog class
	//fields & methods of Puppy class
		public void colour()
		{
			System.out.println("Golden....");
		}
}
class Animal1_Main
{
	public static void main(String[] args)
	{
		//creating object of sub class
		Puppy d=new Puppy();
		
		//access fields and methods
		d.name="Lucy";
		d.eat();
		d.sound();
		d.colour();
		System.out.println("Dog name is " + d.name);
	}

}
