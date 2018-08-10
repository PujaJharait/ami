class Student 
{
	String name;
	int roll;
	int age;
	String qualification;
	String address;
}
	
class MainClass11
{

	public static void main(String[] args) 
	{
		System.out.println("program started");
		Student s1=new Student();
		s1.name="Puja";
	    s1.roll=65;
		s1.age=23;
	    s1.qualification="Btech";
	    s1.address="Mathikere";
		System.out.println(s1.name);
		System.out.println(s1.roll);
		System.out.println(s1.age);
		System.out.println(s1.qualification);
		System.out.println(s1.address);
		System.out.println("program ended");
	}
}
