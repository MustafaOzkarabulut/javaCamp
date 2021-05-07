package Concrete;

import Abstract.GamerService;
import Entitles.Gamer;
import Concrete.GamerCheckManager;

public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		boolean gamerCheck = GamerCheckManager.gamerCheck(gamer);
		
		if (gamerCheck == true) {
			System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"sisteme kay�t oldu.");
		}else {
			System.out.println("Yanl�� tc kimlik numaras�");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"Kullan�c� bilgilerini g�ncelledi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"sistemden hesab�n� sildi.");
		
	}
	
}
