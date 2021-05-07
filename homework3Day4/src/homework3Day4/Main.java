package homework3Day4;


import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;
import Concrete.CampaignManager;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Mustafa");
		gamer1.setLastName("Özkarabulut");
		gamer1.setNationalityId("45745888488");
		gamer1.setDateOfBirth("01.01.2021");
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(2);
		gamer2.setFirstName("Engin");
		gamer2.setLastName("Demiroð");
		gamer2.setNationalityId("12121212122");
		gamer2.setDateOfBirth("01.01.2021");
		
		Campaign campaign1 =new Campaign();
		campaign1.setId(1);
		campaign1.setName("%15 Ýlkbahar kampanyasý");
		campaign1.setDiscountRate(15);
		
		Campaign campaign2 =new Campaign();
		campaign2.setId(2);
		campaign2.setName("%30 Hoþgeldin kampanyasý");
		campaign2.setDiscountRate(30);
		
		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("PUBG");
		game1.setPrice(87);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Valorant");
		game2.setPrice(15);

		Game game3 = new Game();
		game3.setId(3);
		game3.setGameName("GTA V");
		game3.setPrice(115);
		
		Game game4 = new Game();
		game4.setId(4);
		game4.setGameName("CS:GO");
		game4.setPrice(65);
		
		
		
		
		
		
		System.out.println("------SÝSTEME KAYIT ÝÞLEMLERÝ------");
		GamerManager gamerManager = new GamerManager();
		gamerManager.register(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);	
		
		System.out.println("------OYUN EKLEME ÝÞLEMLERÝ------");
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		
		System.out.println("------OYUN GÜNCELLEME VE KALDIRMA ÝÞLEMLERÝ------");
		gameManager.update(game4);
		gameManager.delete(game2);
		
		System.out.println("------KAMPANYA ÝÞLEMLERÝ------");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign1);
		campaignManager.delete(campaign1);
		
		
		
		System.out.println("------SATIÞ ÝÞLEMLERÝ------");
		SaleManager saleManager = new SaleManager();
		saleManager.buy(saleManager, campaign1, gamer1, game4);
		saleManager.buy(saleManager, campaign2, gamer2, game1);
		
		System.out.println("------ÝADE ÝÞLEMLERÝ------");
		saleManager.toReturn(saleManager, campaign2, gamer1, game4);
		
		
	
		
		
	
	
	
	
	}
	

}
