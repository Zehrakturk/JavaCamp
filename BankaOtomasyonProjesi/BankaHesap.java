package Zehra_akturk;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankaHesap {

	public long iban;
	public Date hesapAcilisTarih;
	public double toplamBakiye;
	public String hesapbilgisi;
	public double islemMiktar;
	public String hesapTuru;
	public int musteriNumarasi;// buraya bunu eklememin sebebi hesap eklemek istediğimde musteri numarasindan
								// kontrol edeceğim.

	ArrayList<Long> ibanlar=new ArrayList<>();
	
	// getter ve setter methodları
	public long getIban() {
		return iban;
	}

	public void setIban(long iban) {
		this.iban = iban;
	}

	public Date getHesapAcilisTarih() {
		return hesapAcilisTarih;
	}

	public void setHesapAcilisTarih(Date hesapAcilisTarih) {
		this.hesapAcilisTarih = hesapAcilisTarih;
	}

	public double getToplamBakiye() {
		return toplamBakiye;
	}

	public void setToplamBakiye(double toplamBakiye) {
		this.toplamBakiye = toplamBakiye;
	}

	public String getHesapbilgisi() {
		return hesapbilgisi;
	}

	public void setHesapbilgisi(String hesapbilgisi) {
		this.hesapbilgisi = hesapbilgisi;
	}

	public double getIslemMiktar() {
		return islemMiktar;
	}

	public void setIslemMiktar(double islemMiktar) {
		this.islemMiktar = islemMiktar;
	}

	public String getHesapTuru() {
		return hesapTuru;
	}

	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}

	public int getmusteriNumarasi() {
		return musteriNumarasi;
	}

	public void musteriNumarasi(int musteriNumarasi) {
		this.musteriNumarasi = musteriNumarasi;
	}

	// parametresiz constructor
	public BankaHesap() {

	}

	public BankaHesap(long iban, double toplamBakiye, String hesapbilgisi) {
		this.iban = iban;
		this.toplamBakiye = toplamBakiye;
		this.hesapbilgisi = hesapbilgisi;
		if(hesapbilgisi=="1") {
			hesapTuru="maas";
		}
		else {
			hesapTuru="normal";
		}
		
		Calendar zaman = Calendar.getInstance();
		Date suan =  zaman.getTime();
		this.hesapAcilisTarih = suan; //burada hesapAcilisTarihi isimli değiskeni bilgisayarın şuanki tarihi olarak kabul ediyorum.
	
		ibanlar.add(iban);
		
		VadeliHesap vadeliHesap = new VadeliHesap();
		VadesizHesap vadesizHesap=new VadesizHesap();
		
		if (hesapbilgisi == "1")
		{
				vadeliHesap.faizOrani=(float)0.20;
				vadesizHesap.paraTransfer("1", iban, toplamBakiye, musteriNumarasi);
				System.out.println("Bankamizin maas musterisi oldugunuz icin para transferi islemlerinizde islem ucreti yok!!! ");
	
		}
		else if(hesapbilgisi == "2")
		{
				vadeliHesap.faizOrani=(float)0.10;
				vadesizHesap.paraTransfer("2", iban, toplamBakiye, musteriNumarasi);
				System.out.println("Bankamizin normal hesap turu ile calistiginiz kayit altina alinmistir.");
		}
		else {
			System.out.println("hic biri uymuyor");
		}

	}

	public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, long iban, double toplamBakiye,
			BankaPersonel bankaPersonel) {
		
		ArrayList<Musteri> musteriler2=new ArrayList<>();
		musteriler2.addAll(bankaPersonel.musteriler);
		
		
		
		for(Musteri musteriler : musteriler2) {
			for(BankaHesap hesap : musteriler.hesaplar) {
				if(hesap.musteriNumarasi== musteriNumarasi) {
					System.out.println("musteri numarasi : "+hesap.musteriNumarasi+" Hesap iban: "+iban+" Hesap Bakiye: "+toplamBakiye+" hesap turu: "+ hesap.hesapTuru);
				}
			}
		}
		
	
		
	}

	@Override
	public String toString() {
		return "BankaHesap [iban=" + iban + ", hesapAcilisTarih=" + hesapAcilisTarih + ", toplamBakiye=" + toplamBakiye
				+ ", hesapbilgisi=" + hesapbilgisi + ", islemMiktar=" + islemMiktar + ", hesapTuru=" + hesapTuru + "]";
	}

}
