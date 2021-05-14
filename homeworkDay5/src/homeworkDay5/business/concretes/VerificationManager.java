package homeworkDay5.business.concretes;

import homeworkDay5.business.abstracts.verification;
import homeworkDay5.entities.concretes.User;

public class VerificationManager implements verification{

	@Override
	public boolean password(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("�ifre uzunlu�u 6 dan k���k olamaz");
			return false;
		}else {
			return true;
		}
		

	}

	@Override
	public boolean mailAut(User user) {
 
        String phone = user.getMail();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean result = phone.matches(regex);
        if(result) {
           return  true;
        } else {
            System.out.println("Girilen Mail Format� Yanl��!");   
        }
        return false;
    }
	
	

	@Override
	public boolean nameAndSurname(User user) {
	  if (user.getFirstName().length()>2 && user.getLastName().length()>2) {
		return true;
	}else {
		System.out.println("�sim soyisim 2 karakterden b�y�k olmal�d�r.");
		return false;
	}
		
	}

}
