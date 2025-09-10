//Muhammad Armughan Aziz
//SP25-BCS-091

class Student{

	private String Name;
	private String email;
	private double CGPA;

	public void display(String Name, String email, double CGPA){

		this.Name = Name;
		this.email = email;
		this.CGPA = CGPA;

		System.out.println("Name: " + this.Name);
		System.out.println("Email: " + this.email);
		System.out.println("CGPA: " + this.CGPA);
	}	

}

public class StudentTest{

	public static void main(String args[]){

		Student s1 = new Student();

		s1.display("Ali", "kjlj;jkj@gamil.com", 3.33);		

	} 

}