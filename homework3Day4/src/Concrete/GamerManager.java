package Concrete;

import Abstract.GamerService;
import Entitles.Gamer;
import Concrete.GamerCheckManager;

public class GamerManager implements GamerService{

	@Override
	public void register(Gamer gamer) {
		boolean gamerCheck = GamerCheckManager.gamerCheck(gamer);
		
		if (gamerCheck == true) {
			System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"sisteme kayýt oldu.");
		}else {
			System.out.println("Yanlýþ tc kimlik numarasý");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"Kullanýcý bilgilerini güncelledi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+gamer.getLastName()+ " " +"sistemden hesabýný sildi.");
		
	}
	
}
