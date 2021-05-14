package homeworkDay5.dataAccess.abstracts;

import homeworkDay5.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	void delete(User user);
}
