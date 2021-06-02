package kodlamaio.hrms.core.utilities.results;

import kodlamaio.hrms.entities.concretes.User;

public class CheckManager {
	public static boolean passwordCheck(User user) {
		if (user.getPassword()==user.getRepassword()) {
			return true;
		}
		return false;
		
	}
}
