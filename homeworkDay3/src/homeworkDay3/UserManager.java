package homeworkDay3;

public class UserManager{
	
	
	String registerMessage= "Giri� yapt�";
	String exitMessage= "��k�� yapt�";
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+ registerMessage);
	}
	
	public void exit(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+ exitMessage);
	}

}
