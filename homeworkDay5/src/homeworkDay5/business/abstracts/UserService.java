package homeworkDay5.business.abstracts;

import homeworkDay5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);	
}
