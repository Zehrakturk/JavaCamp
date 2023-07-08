package Zehra_akturk;

import java.util.Calendar;
import java.util.Date;

public class VadesizHesap extends BankaHesap{

	public String hesapTuru;
	public double vadesizBakiye;
	
	//getter ve setter methodları
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	public double getVadesizBakiye() {
		return vadesizBakiye;
	}
	public void setVadesizBakiye(double vadesizBakiye) {
		this.vadesizBakiye = vadesizBakiye;
	}
	
	
	//parametresiz constuctor
	public VadesizHesap() {
		
	}
	
	public VadesizHesap(String hesapTuru, double vadesizBakiye,int musteriNumarasi) {
		Calendar zaman = Calendar.getInstance();
		Date suan =  zaman.getTime();
		this.hesapAcilisTarih = suan; 
		
		this.hesapTuru = hesapTuru;
		this.vadesizBakiye = vadesizBakiye;
		this.toplamBakiye=vadesizBakiye;
		this.musteriNumarasi=musteriNumarasi;//bunu eklememin sebebi musteri classı içerisinde hesapsil methodunu kullanırken hesabın o musteriye ait olup olmadığını kontrol edebilmek
	}
	
	public double paraTransfer(String hesapTuru, long iban, double vadesizBakiye, int islemMiktar) {
		
		BankaHesap bankaHesap=new BankaHesap();
		boolean ibanDogruMu=false;
		
		for (Long iban1 : bankaHesap.ibanlar) {
			if(iban1==iban) {
				ibanDogruMu=true;
			}
			else {
				ibanDogruMu=false;
			}
		}
		
		if(ibanDogruMu==true ) {
			if(hesapTuru=="1") {
				return 0.0;
			}
			else if(hesapTuru=="2"){
				return 8.0;
			}
			else {
				return 8.0;
			}
		}else {
			System.out.println("yanlis iban");
			return 8.0;
		}
		
		/*Musteri musteri =new Musteri();
		
		

		int i,kontrol = 0;
		for(i=0;i<musteri.hesaplar.size();i++) {
			if(musteri.hesaplar.get(i).iban==iban && hesapTuru=="1") {
				kesintiMiktari=0.0;
				break;
			}
			else if(musteri.hesaplar.get(i).iban==iban && hesapTuru=="2") {
				kontrol=0;
			}
		}
		
		double kesintiMiktari;
		if(kontrol==1) {
			return kesintiMiktari=0.0;
		}
		else {
			return kesintiMiktari=8.0;
		}*/
		
	}
	
	
	public double krediKartiBorcOdeme(double vadesizBakiye, KrediKarti kart) {
		//hangi kredikarti oldugunu belirleyebilmek icin kredi kartini parametre olarak aldım.
	
		vadesizBakiye=vadesizBakiye-kart.guncelBorc;
		
		if(vadesizBakiye>kart.guncelBorc) {
			return kart.guncelBorc=0;
		}
		else if(vadesizBakiye==kart.guncelBorc) {
			return kart.limit=kart.guncelBorc=0;
		}
		else {
			return kart.guncelBorc-=vadesizBakiye;
		}
		
	}
	
	
	
	public double krediOdeme(int krediID, Krediler kredi)//Kredi nesnesini parametrre olarak aldıgımız icin rahatlıkla kredi miktarina ve 
	{                                                    //teksit miktarına  bu nesne üzerinden erişebilirim.
		vadesizBakiye-=kredi.taksitMiktari;               //bundan dolayı bu parametreleri sildim.
		kredi.krediMiktari-=kredi.taksitMiktari;//vadesiz bakiyeden kredinin bir taksidini ödemiş oluyoruz.
		return kredi.krediMiktari;                                        //bu yüzden kredi miktarini da bir taksit azalmış oluyoruz.
	}
	
	
	@Override
	public String toString() {
		return "VadesizHesap [hesapTuru=" + hesapTuru + ", vadesizBakiye=" + vadesizBakiye + "]";
	}
}

