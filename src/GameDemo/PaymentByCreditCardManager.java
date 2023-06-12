package odev_3;

public class PaymentByCreditCardManager extends BaseSalesManager implements SalesManagerService{

	@Override
	public void take(Gamer gamer) {
		System.out.println("Satin alma isleminiz basarili "+gamer.firstName);
	}

}
