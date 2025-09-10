//Muhammad Armughan Aziz
//SP25-BCS-091

class Student{

	private String Name;
	private String email;
	private double CGPA;

	Student(String Name, String email, double CGPA){

		public void getName(String newName){

			Student.setName(newName);

		}

		public void setName(String newName2){

			Name = newName2;

			this.Name = Name;

		}

		public void getEmail(String newEmail){

			Student.setEmail(newEmail);

		}

		public void getName(String newEmail2){

			email = newEmail2;

			this.email = email;

		}

		public void getCGPA(String newCGPA){

			Student.setCGPA(newCGPA);

		}

		public void getCGPA(String newCGPA2){

			CGPA = newCGPA2;

			this.CGPA = CGPA;

		}

		public void displayNew(){

			System.out.println("Name: " + this.Name);
			System.out.println("Email: " + this.email);
			System.out.println("CGPA: " + this.CGPA);

		}		

	}

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

		Student s2 = new Student("Haris", "djsfkal@gmail.com", 2.22);

		s2.getName("Another name");

		s2.getEmail("hfaeio@gmail.com");

		s2.getCGPA(3.55);	

	}

}