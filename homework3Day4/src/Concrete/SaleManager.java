package Concrete;

import Abstract.SaleService;
import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void buy(SaleManager saleManager,Campaign campaign, Gamer gamer,Game game) {
		double newPrice = game.getPrice()*campaign.getDiscountRate()/100;
		newPrice = game.getPrice()-newPrice;
		
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+campaign.getName()+"ndan faydalanarak "+game.getGameName()+" "+"adlý oyunu"+" "+game.getPrice()+" TL yerine "+newPrice+"TL'ye satýn aldý.");
		
		}

	@Override
	public void toReturn(SaleManager saleManager,Campaign campaign, Gamer gamer,Game game) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+game.getGameName()+" "+"adlý oyunu iade etti.");
	}

	
	


}
