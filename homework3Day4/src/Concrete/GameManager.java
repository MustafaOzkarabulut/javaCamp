package Concrete;

import Abstract.GameService;
import Entitles.Game;
import Entitles.Gamer;

public class GameManager implements GameService{
	@Override
	public void add(Game game){
		System.out.println(game.getGameName()+" "+"adlý oyun"+" "+game.getPrice()+" "+"TL'ye listelendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println("ID : "+game.getId()+" "+game.getGameName()+" "+"adlý oyun"+" "+"güncellendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println("ID : "+game.getId()+" "+game.getGameName()+" "+"adlý oyun"+" "+"sistemden kaldýrýldý.");
	}

}
