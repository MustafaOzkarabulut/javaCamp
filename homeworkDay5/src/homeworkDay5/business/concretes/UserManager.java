package homeworkDay5.business.concretes;

import homeworkDay5.business.abstracts.UserService;
import homeworkDay5.business.abstracts.verification;
import homeworkDay5.core.abstracts.Google;
import homeworkDay5.core.concretes.GoogleManagerAdapter;
import homeworkDay5.dataAccess.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class UserManager implements UserService, Google{
	
	private verification verificationService;
	
	private UserDao userdao;
	public UserManager(UserDao userdao, verification verificationService) {
		super();
		this.userdao = userdao;
		this.verificationService = verificationService;
	}
	
	
	@Override
	public void signUp(User user) {   
		
		if(verificationService.mailAut(user) && verificationService.nameAndSurname(user) && verificationService.password(user)) {
			System.out.println("Do�rulama maili g�nderildi");
			this.userdao.register(user);			
	
		}else {
			System.out.println("Kay�t Ba�ar�s�z.");
		}
		
	}
	
	@Override
	public void signIn(User user) {
		if(verificationService.mailAut(user) && verificationService.password(user)) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" Giri� ba�ar�l�");
	
		}else {
			System.out.println("Giri� Ba�ar�s�z. Yanl�� �ifre veya mail adresi");
		}	
	}


	@Override
	public void registerWithGoogle(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+"Google ile Giri� Yap�ld�");
		
	}		
}


