package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student(1251, "Mustafa" , "Özkarabulut");
		StudentManager studentManager = new StudentManager();
		
		Instructor instructor = new Instructor(1879, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager();
		
		UserManager userManager = new UserManager();
		userManager.register(instructor);
		userManager.register(student);
		
		System.out.println("-----------------------------------");
		
		instructorManager.addHomework(instructor);
		instructorManager.removeHomework(instructor);
		
		System.out.println("-----------------------------------");
		
		studentManager.join(student);
		studentManager.didNot(student);
		
		System.out.println("-----------------------------------");
		
		studentManager.polling(student);
		studentManager.polling1(student);
		
		System.out.println("-----------------------------------");
		
		userManager.exit(instructor);
		userManager.exit(student);
		
		
		

		

		

		

		

	
	}

}
