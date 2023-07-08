package Zehra_akturk;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		
		
		Musteri musteri=new Musteri((int) rastgele(5),1,"zehra","akturk", "zehra.akturk15@gmail.com",(int)rastgele(6),144000);
		Musteri musteri2=new Musteri((int) rastgele(5),2,"mert","karatekin", "mertqkaratekin16@gmail.com",(int)rastgele(7),620000);
		Musteri musteri3=new Musteri(213608590,3,"Hayat","yilmaz","hayat_43@gmail.com",34000,54000);
		Musteri musteri4 = new Musteri(213608,4,"yeliz","aydin","yeliz.aydim@gmail.com",540360,480000);
		
		
		BankaPersonel bankaPersonel1 =new  BankaPersonel(443562,"aysel","hakkioglu","aysel.hakkioglu48@gmail.com",638482025);
		bankaPersonel1.musteriler.add(musteri);
		bankaPersonel1.musteriler.add(musteri2);
		bankaPersonel1.musteriler.add(musteri3);
		bankaPersonel1.musteriler.add(musteri4);
		
		BankaHesap bankaHesap= new VadeliHesap("1",4330,1,1);
		musteri.hesaplar.add(bankaHesap);
		
		BankaHesap bankaHesap2= new VadesizHesap("2",5068.4,2);
		musteri2.hesaplar.add(bankaHesap2);
		
		YatirimHesap yatirimHesap= new YatirimHesap("1",10000,"altin",(int)1245.50,3);
		musteri3.hesaplar.add(yatirimHesap);
	
		
		VadeliHesap vadeli= new VadeliHesap("1", 5600,(float)0.3 ,4);
		musteri.hesaplar.add(vadeli);
		
		ArrayList<BankaHesap> bankaHesaplari= new ArrayList();
		bankaHesaplari.add(yatirimHesap);
		bankaHesaplari.add(bankaHesap2);
		bankaHesaplari.add(bankaHesap);
		bankaHesaplari.add(vadeli);
		
		
		Date ocakBir = new Date(122, 0, 1);//bir ocak gününü tutan bir date degiskeni olusturdum.
		
		for (BankaHesap hesap : bankaHesaplari) {

			if(hesap.hesapAcilisTarih.after(ocakBir)) {
				System.out.println("Musteri Numarasi: "+hesap.getmusteriNumarasi()+"\tToplam Bakiye: "+hesap.getToplamBakiye());
			}			
		}
		
		
		KrediKarti krediKarti= new KrediKarti((int)rastgele(3),300000.0,3500,2000);
		musteri.krediKartlari.add(krediKarti);
		
		KrediKarti krediKarti2= new KrediKarti((int)rastgele(3),2000.5,12000.3,3000);
		musteri3.krediKartlari.add(krediKarti2);
		
		//krediKarti2.krediKartıSil(musteri, krediKarti);
		
		Krediler kredi= new Krediler(1,3,10000);
		
		
		
		
		for (Musteri muster : bankaPersonel1.musteriler) {
		    for (KrediKarti kart : muster.getKrediKartlari()) {
		        if (kart.getLimit() < 5000.0) {
		        	System.out.println(muster.getAd()+" "+muster.getSoyad()+" adli musterinin 5000 tl limit altindaki kredi kartlari:");
		            System.out.println("Kart No: " + kart.getKartNumarasi() + " Guncel Borc Bilgisi: " + kart.getGuncelBorc());
		        }
		    }
		}
		
		
		
		
		for (Musteri muster : bankaPersonel1.musteriler) {
		    for (KrediKarti kart : muster.getKrediKartlari()) {
		        if(kart.getLimit() > 10000.0) {
		        	int secenek = JOptionPane.showConfirmDialog(null,muster.getAd()+" "+muster.getSoyad()+ " Sizin için harika bir teklifimiz var!!\n Bankamızdan %1 faiz ile kredi almak ister misiniz?", "Kredi Kartı Teklifi", JOptionPane.YES_NO_OPTION);

		        	if (secenek == JOptionPane.YES_OPTION) {
		        		int cevap = JOptionPane.showOptionDialog(null,"Harika! Kredi başvurunuzu işleme alıyoruz." , "Kredi Teklifi", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{ "Tamam" }, JOptionPane.DEFAULT_OPTION);

		        	} else {
		        		int cevap = JOptionPane.showOptionDialog(null, "Üzgünüz, belki başka bir zaman.", "Kredi Teklifi", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{ "Tamam" }, JOptionPane.DEFAULT_OPTION);

		        	}
		        }
		    }
		}
		
		bankaHesap2.hesapGoruntuleme(2, "mert", "karatekin", 245, 3456, bankaPersonel1);

		
		
		
		
	}
	
	public static long rastgele(int kacBasamak) {
	    Random random= new Random();
	    
	    Set<Integer> uniqueNumbers = new HashSet<>();//üretilen her random sayinin birbirinden farklı olup olmadığını kontrol etmek için set e kaydediyoruz.
	    
	    long max = (long) Math.pow(10, kacBasamak);
	    long min = (long) Math.pow(10, kacBasamak-2);
	    
	    long randomSayi = random.nextLong(max-min)+min;
	    
	    if(!uniqueNumbers.contains(randomSayi)) {//burada set in icinde ürettiğimiz random sayi var mı kontrol ediyoruz
	    	uniqueNumbers.add((int) randomSayi);//icinde bu randomSayi yoksa döndürüyoruz.
	    	return randomSayi;
	    }else {
	    	rastgele(5);
	    }
	    
	    return randomSayi;
	}

}
