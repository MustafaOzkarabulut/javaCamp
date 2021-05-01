package homworkOne;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println("Hoca eklendi " + instructor.instructorName);
	}
	
	public void getCourses(Course[] courses) { 
		for (Course course : courses) {
			System.out.println(course.name +"-"  );
	}
}
}
