class Employee 
{
	String name;
	int id;
	int age;
	String qualification;
	String address;
	double salary;
	String email;
}
	
class MainClass12
{

	public static void main(String[] args) 
	{
		System.out.println("program started");
		Employee s1=new Employee();
		s1.name="Anand Kashyap";
	    s1.id=5;
		s1.age=24;
	    s1.qualification="Btech";
	    s1.address="Hyderabad";
		s1.salary=500000;
		s1.email="anad@gmail.com";
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println(s1.qualification);
		System.out.println(s1.address);
		System.out.println(s1.salary);
		System.out.println(s1.email);
		System.out.println("program ended");
	}
}

