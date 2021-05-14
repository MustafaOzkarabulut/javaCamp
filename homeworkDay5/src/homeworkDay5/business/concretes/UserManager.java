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
			System.out.println("Doðrulama maili gönderildi");
			this.userdao.register(user);			
	
		}else {
			System.out.println("Kayýt Baþarýsýz.");
		}
		
	}
	
	@Override
	public void signIn(User user) {
		if(verificationService.mailAut(user) && verificationService.password(user)) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" Giriþ baþarýlý");
	
		}else {
			System.out.println("Giriþ Baþarýsýz. Yanlýþ þifre veya mail adresi");
		}	
	}


	@Override
	public void registerWithGoogle(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" "+"Google ile Giriþ Yapýldý");
		
	}		
}


