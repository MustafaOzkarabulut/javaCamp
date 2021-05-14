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
		user.setLastName("Özkarabulut");
		user.setMail("deneme@gmail.com");
		user.setPassword("6549748949");
		
		User user1 = new User();
		user1.setFirstName("En");
		user1.setLastName("De");
		user1.setMail("denemegmail.com");
		user1.setPassword("949");
	
		
		UserManager userManager = new UserManager(new HibernateUserDao(),new VerificationManager());

		System.out.println("--------Kayýt Ýþlemleri--------");
		userManager.signUp(user);
		System.out.println("--------Baþarýsýz Kayýt Ýþlemleri--------");
		userManager.signUp(user1);
		System.out.println("--------Baþarýlý Giriþ Ýþlemleri--------");
		userManager.signIn(user);
		System.out.println("--------Baþarýsýz Giriþ Ýþlemleri--------");
		userManager.signIn(user1);
		System.out.println("--------Google Ýþlemleri--------");
		userManager.registerWithGoogle(user);
		
		
	
		
	}

	

}
