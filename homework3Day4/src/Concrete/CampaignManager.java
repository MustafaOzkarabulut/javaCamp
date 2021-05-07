package Concrete;

import Abstract.CampaignService;
import Entitles.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme"+" "+campaign.getName()+" "+"adl� yeni kampanya eklenmi�tir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" "+"adl� Kampanyan�n bilgileri g�ncellenmi�tir!");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" "+"adl� kampanya sistemden kald�r�lm��t�r.");
	}

}
