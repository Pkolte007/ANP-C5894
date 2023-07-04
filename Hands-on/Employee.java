package oops;

class Employee 
{
	   private int Employee_ID;
	   private String name;
	   private int age;
	   private String address;
	   private int phone_no;
	   private String Job_Profile;
	   private String Location;
	  
	   public int getEmployee_ID() {
		return Employee_ID;
	   }
	   public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
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
	public String getJob_Profile() {
		return Job_Profile;
	}
	public void setJob_Profile(String job_Profile) {
		Job_Profile = job_Profile;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	   
	   
	   
	   
	    
}
	class Employee_main
	{
		public static void main(String[] args)
		{
			//Creating instance of class Encapsulation
		    Employee e=new Employee();
			//Setting values
			e.setEmployee_ID(1);
			e.setName("Prasanna");
			e.setAge(21);
			e.setAddress("Badlapur");
			e.setPhone_no(123);
			e.setJob_Profile("Developer");
			e.setLocation("Mumbai");
			
			
			
			//Print values
			System.out.println("Employee Id:- " + e.getEmployee_ID());
			System.out.println("Name is: " + e.getName());
			System.out.println("Age is: " + e.getAge());
			System.out.println("Address: " + e.getAddress());
			System.out.println("Phone no:- " + e.getPhone_no());
			System.out.println("Job Profile " + e.getJob_Profile());
			System.out.println("Location: " + e.getLocation());
		}
}




	

