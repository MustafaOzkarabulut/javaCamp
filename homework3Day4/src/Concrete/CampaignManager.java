package Concrete;

import Abstract.CampaignService;
import Entitles.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Sisteme"+" "+campaign.getName()+" "+"adlý yeni kampanya eklenmiþtir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" "+"adlý Kampanyanýn bilgileri güncellenmiþtir!");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" "+"adlý kampanya sistemden kaldýrýlmýþtýr.");
	}

}
