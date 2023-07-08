package Zehra_akturk;

import java.util.Scanner;

public class Krediler {

	private int krediID;
	public double krediMiktari;
	public double taksitMiktari;

	// getter ve setter methodları
	public int getKrediID() {
		return krediID;
	}

	public void setKrediID(int krediID) {
		this.krediID = krediID;
	}

	public double getKrediMiktari() {
		return krediMiktari;
	}

	public void setKrediMiktari(double krediMiktari) {
		this.krediMiktari = krediMiktari;
	}

	public double getTaksitMiktari() {
		return taksitMiktari;
	}

	public void setTaksitMiktari(double taksitMiktari) {
		this.taksitMiktari = taksitMiktari;
	}

	// parametresiz constructor
	public Krediler() {

	}

	
	public Krediler(int krediID, int musteriNumarasi,double krediMiktari) {
		super();
		this.krediID = krediID;
		this.krediMiktari = krediMiktari;
		BankaPersonel bankaPersonel=new BankaPersonel();
		int i;
		for(i=0;i<bankaPersonel.musteriler.size();i++) {
			if(bankaPersonel.musteriler.get(i).getMusteriNumarasi()==musteriNumarasi) 
			{//burada mainden verdigimiz musteri numarasina ait musteri nesnesini tespit ediyoruz.
				krediMiktari=(bankaPersonel.musteriler.get(i).yillikKazanc)*(50/100);
				//Bu musteri numarasina ait nesneyi buldugumuzda ise yillik kazancinin yüzde ellisi kadar kredi veriyoruz
			}
	
		}

	}

	public void kampanya(KrediKarti kart) {

		if( kart.limit == kart.guncelBorc || kart.limit<kart.guncelBorc) {
			System.out.println("Guncel borclarinizi kapatmaniz icin size ozel %0.1 faizle ihtiyac kredisi imkani sagliyoruz!!");
			System.out.println("Kampanyayi incelemek icin 1 e tiklayin.");
			Scanner scan = new Scanner(System.in);
			int secim= scan.nextInt();
			if(secim==1) {
				System.out.println("Kredi basvurunuz basari ile alinmistir.");
			}else {
				System.out.println("Daha sonra tekrar gorusmek dilegi ile...");
			}
		}
		
		
		if( kart.limit>= 5000) {
			System.out.println("Kart limiti 5000 tl ve uzeri musterilerimize her internet alisverisinde 100 bonus para hediye!!!");
			System.out.println("Yine internet alisverislerinizde kullanabileceginiz bonus para kazanmak istiyorsaniz 1 e tiklayiniz.");
		
			Scanner scan = new Scanner(System.in);
			int secim= scan.nextInt();
			if(secim==1) {
				System.out.println("Harika her alisverisinizde bonus para kazabilirsiniz!!!");
			}else {
				System.out.println("Daha sonra tekrar gorusmek dilegi ile...");
			}
		}
		else {
			System.out.println("Bonus para kazanmak icin tek tikla kart limitinizi arttirabilirsiniz!! Devam etmek icin 1 e tiklayiniz.");
			Scanner scan = new Scanner(System.in);
			int secim= scan.nextInt();
			if(secim==1) {
				System.out.println("Limit arttirma talebiniz basari ile alinmistir. Harika her alisverisinizde bonus para kazabilirsiniz!!!");
			}else {
				System.out.println("Daha sonra tekrar gorusmek dilegi ile...");
			}
		}
	}

	@Override
	public String toString() {
		return "Krediler [krediID=" + krediID + ", krediMiktari=" + krediMiktari + ", taksitMiktari=" + taksitMiktari
				+ ", getKrediID()=" + getKrediID() + ", getKrediMiktari()=" + getKrediMiktari()
				+ ", getTaksitMiktari()=" + getTaksitMiktari() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
