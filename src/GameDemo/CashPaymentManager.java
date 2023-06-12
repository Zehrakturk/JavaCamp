package odev_3;

public class CashPaymentManager extends BaseSalesManager{
	
	@Override
	public void useCampaign(Gamer gamer, Campaign campaign) {
		System.out.println(campaign.getName()+"Satin alma islemi basarili."+gamer.getFirstName());
	}


	
}
