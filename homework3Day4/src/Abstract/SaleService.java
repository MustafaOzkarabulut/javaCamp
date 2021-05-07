package Abstract;

import Concrete.SaleManager;
import Entitles.Campaign;
import Entitles.Game;
import Entitles.Gamer;

public interface SaleService {
	void buy(SaleManager saleManager,Campaign campaign, Gamer gamer,Game game);
	
	void toReturn(SaleManager saleManager,Campaign campaign, Gamer gamer,Game game);
}
