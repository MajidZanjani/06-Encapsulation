package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {

		Student student = new Student();
		
		// student.id = 0; // Compile Error
		
		student.setId(1);
		student.setName("Majid_Zanjani");
		student.setAge(16);
		
		// System.out.println(student.Id + " " + student.Name + " " + student.Age); // Compile Error
		
		System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());		

	}

}
