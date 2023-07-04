package oops;

class Students 
{
   private int roll_no;
   private String name;
   private int age;
   private String address;
   private int phone_no;
   private String Hobby;
   
   
   public int getRoll_no() {
	return roll_no;
   }
   public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getAge() {
	return age;
   }
   public void setAge(int age) {
	this.age = age;
   }
   public String getAddress() {
	return address;
   }
   public void setAddress(String address) {
	this.address = address;
   }
   public int getPhone_no() {
	return phone_no;
   }
   public void setPhone_no(int phone_no) {
	this.phone_no = phone_no;
   }
   public String getHobby() {
	return Hobby;
   }
   public void setHobby(String hobby) {
	Hobby = hobby;
   }
   
    
}
class Students_main
{
	public static void main(String[] args)
	{
		//Creating instance of class Encapsulation
		Students e=new Students();
		//Setting values
		e.setRoll_no(1);
		e.setName("Prasanna");
		e.setAge(21);
		e.setAddress("Berlin");
		e.setPhone_no(123);
		e.setHobby("Trek");
		
		
		//Print values
		System.out.println("Roll no:- " + e.getRoll_no());
		System.out.println("Name is: " + e.getName());
		System.out.println("Age is: " + e.getAge());
		System.out.println("Address: " + e.getAddress());
		System.out.println("Phone no:- " + e.getPhone_no());
		System.out.println("Hobby is: " + e.getHobby());
	}
}

