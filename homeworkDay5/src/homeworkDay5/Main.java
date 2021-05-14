package homeworkDay5;


import homeworkDay5.withGoogle.*;
import homeworkDay5.business.concretes.UserManager;
import homeworkDay5.business.concretes.VerificationManager;
import homeworkDay5.core.concretes.GoogleManagerAdapter;
import homeworkDay5.dataAccess.concretes.HibernateUserDao;
import homeworkDay5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setFirstName("Mustafa");
		user.setLastName("�zkarabulut");
		user.setMail("deneme@gmail.com");
		user.setPassword("6549748949");
		
		User user1 = new User();
		user1.setFirstName("En");
		user1.setLastName("De");
		user1.setMail("denemegmail.com");
		user1.setPassword("949");
	
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new VerificationManager());

		System.out.println("--------Kay�t ��lemleri--------");
		userManager.signUp(user);
		System.out.println("--------Ba�ar�s�z Kay�t ��lemleri--------");
		userManager.signUp(user1);
		System.out.println("--------Ba�ar�l� Giri� ��lemleri--------");
		userManager.signIn(user);
		System.out.println("--------Ba�ar�s�z Giri� ��lemleri--------");
		userManager.signIn(user1);
		System.out.println("--------Google ��lemleri--------");
		userManager.registerWithGoogle(user);
		
		
	
		
	}

	

}
