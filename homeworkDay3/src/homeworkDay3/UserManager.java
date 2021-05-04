package homeworkDay3;

public class UserManager{
	
	
	String registerMessage= "Giriþ yaptý";
	String exitMessage= "Çýkýþ yaptý";
	
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+ registerMessage);
	}
	
	public void exit(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+ exitMessage);
	}

}
