package homeworkDay3;

public class InstructorManager{
		
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" " +"Sisteme yeni �dev ekledi");
	}
	
	public void removeHomework(Instructor instructor) {
		System.out.println(instructor.getId()+" "+instructor.getFirstName()+" "+instructor.getLastName()+" "+"�devi sistemden kald�rd�");
	}
}
