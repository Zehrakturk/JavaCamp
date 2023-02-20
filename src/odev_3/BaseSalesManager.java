package odev_3;

public class BaseSalesManager implements SalesManagerService{

	@Override
	public void take(Gamer gamer) {
		System.out.println("Oyunu basariyla satin aldiniz " + gamer.firstName+" " + gamer.lastName);
	}

	@Override
	public void useCampaign(Gamer gamer, Campaign campaign) {
		System.out.println("Kampanya kullanildi.");
	}

	
}
