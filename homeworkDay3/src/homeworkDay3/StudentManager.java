package homeworkDay3;

public class StudentManager{
	
	
	String message = "Ödevi yaptý";
	String polling = "Yoklamasý alýndý";
	String message1 = "Ödevi yapmadý";
	String pollingMessage = "Yok yazýldý";
	
	
	
	public void join(Student student) {
			String message = "Ödevi yaptý";
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



//ödev tamamlandý
