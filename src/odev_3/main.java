package odev_3;

public class main {

	

	private static final GamerCheckServes GamerCheckServes = null;

	public static void main(String[] args) {
		
		Gamer gamer=new Gamer("nationlity", "zehra", "aktürk", 2003);
		Campaign campaign=new Campaign(null, null, 0);
		BaseSalesManager baseSalesManager=new PaymentByCreditCardManager();
		baseSalesManager.take(gamer);
		baseSalesManager.useCampaign(gamer, campaign);
	}


}
