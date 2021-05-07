package Concrete;

import Entitles.Gamer;

public class GamerCheckManager {
	
	public static boolean gamerCheck(Gamer gamer) {
		if(gamer.getNationalityId().length() > 11) {
			return false;
		}
		else if(gamer.getNationalityId().length() > 0 && gamer.getNationalityId().length() == 11 && !gamer.getNationalityId().startsWith("0")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	
}
