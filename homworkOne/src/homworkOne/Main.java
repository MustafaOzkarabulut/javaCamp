package homworkOne;

import java.io.Console;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# Yaz�l�mc� Yeti�tirme Kamp�");
		
		Course course2 = new Course(2, "JAVA Yaz�l�mc� Yeti�tirme Kamp�");

		Course course3 = new Course(3, "React Yaz�l�mc� Yeti�tirme Kamp�");
		
		Course[] courses = {course1, course2, course3};
		
		Instructor instructor1 = new Instructor("Engin Demiro�");
		
		Instructor instructor2 = new Instructor("Mustafa �zkarabulut");
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor1);
		instructorManager.add(instructor2);
		
			
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.getCourses(courses);
		
		Instructor[] instructors = {
				instructor1,
				instructor2
		};
		
		
		for (int i = 0; i < instructors.length; i++) {
				System.out.println(courses[i].name +"-"+ instructors[i].instructorName);
		}
		
		
	
	}

}
