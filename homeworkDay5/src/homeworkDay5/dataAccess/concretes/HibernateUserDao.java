package homeworkDay5.dataAccess.concretes;

import homeworkDay5.dataAccess.abstracts.UserDao;
import homeworkDay5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {
		System.out.println("Hesap do�rulama ba�ar�l� : "+user.getFirstName()+" "+user.getLastName() +" Kay�t oldu");
			
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

}
