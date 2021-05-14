package homeworkDay5.business.abstracts;

import homeworkDay5.entities.concretes.User;

public interface verification {
	 boolean password(User user);
	 boolean mailAut(User user);
	 boolean nameAndSurname(User user);

}
