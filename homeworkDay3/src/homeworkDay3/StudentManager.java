package homeworkDay3;

public class StudentManager{
	
	
	String message = "�devi yapt�";
	String polling = "Yoklamas� al�nd�";
	String message1 = "�devi yapmad�";
	String pollingMessage = "Yok yaz�ld�";
	
	
	
	public void join(Student student) {
			String message = "�devi yapt�";
			System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" " + message);
		}

	
	public void didNot(Student student) {
		System.out.println(student.getId()+" "+student.getFirstName()+" "+student.getLastName()+" " + message1);
	}
	
	
	
	public void polling(Student student) {
			System.out.println(student.getFirstName()+" "+student.getLastName()+" " + polling);
		}

	public void polling1(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" " + pollingMessage);
	}	
		
}



//�dev tamamland�
