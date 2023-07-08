package Zehra_akturk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musteri extends Kisi {

	private int musteriNumarasi;
	ArrayList<BankaHesap> hesaplar = new ArrayList<>();
	ArrayList<KrediKarti> krediKartlari = new ArrayList<>();
	public int yillikKazanc;//bu degiskeni krediler bölümünde yillik kazancinin %50 si kadar kredi verebilmek icin aldim.

	public int getMusteriNumarasi() {
		return musteriNumarasi;
	}

	public void setMusteriNumarasi(int musteriNumarasi) {
		this.musteriNumarasi = musteriNumarasi;
	}

	public List<BankaHesap> getHesaplar() {
		return hesaplar;
	}

	public void setHesaplar(ArrayList<BankaHesap> hesaplar) {
		this.hesaplar = hesaplar;
	}

	public List<KrediKarti> getKrediKartlari() {
		return krediKartlari;
	}

	public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
		this.krediKartlari = krediKartlari;
	}
	public int getyillikKazanc() {
		return yillikKazanc;
	}

	public void setyillikKazanc(int yillikKazanc) {
		this.yillikKazanc = yillikKazanc;
	}
	
	
	//parametresiz constructor
	public Musteri() {
		super();

	}

	public Musteri(int tcKimlikNo, int musteriNumarasi, String ad, String soyad, String email, int telefonNumarasi,int yillikKazanc) {
		//yillikKazanc degiskeni krediler bölümünde yillik kazancinin %50 si kadar kredi verebilmek icin aldim.
		super(ad, soyad, email, telefonNumarasi);
		this.yillikKazanc=yillikKazanc;
		this.hesaplar=hesaplar;
		this.krediKartlari=krediKartlari;
	}

	// UML diagramında istenen methodlar
	public void hesapEkle(int tcKimlikNo, int musteriNumarasi, String ad, String soyad) {

		System.out.println("Hesap turunuzu seciniz. \n 1-Vadeli hesap 2- vadesiz hesap 3- yatirim hesabi");
		Scanner secim = new Scanner(System.in);
		int sonuc = secim.nextInt();
		
		if (sonuc == 1) {
			hesaplar.add(new VadeliHesap("vadeliHesap", 3500, (float) 0.05, musteriNumarasi));
			System.out.println(ad + " " + soyad + " " + musteriNumarasi + " numarali musteriye Vadeli Hesap acildi. ");
		} else if (sonuc == 2) {
			hesaplar.add(new VadesizHesap("vadesiz hesap", 1345.23, musteriNumarasi));
			System.out.println(ad + " " + soyad + " " + musteriNumarasi + " numarali musteriye Vadesiz Hesap acildi. ");
		} else if (sonuc == 3) {
			hesaplar.add(new YatirimHesap("yatirim hesap", 200000, "altın", (float) 1245.7, musteriNumarasi));
			System.out
					.println(ad + " " + soyad + " " + musteriNumarasi + " numarali musteriye yatirim Hesabi acildi. ");
		}

		/*
		 * BankaHesap bankaHesap =new BankaHesap();
		 * if(bankaHesap.musteriNumarasi==this.musteriNumarasi) {
		 * if(bankaHesap.getHesapTuru()=="vadesizHesap") { VadesizHesap vadesizHesap=new
		 * VadesizHesap(); hesaplar.add(vadesizHesap);
		 * System.out.println("vadesiz hesabınız olusturuldu"); }
		 * if(bankaHesap.getHesapTuru()=="vadeliHesap") { VadeliHesap vadeliHesap=new
		 * VadeliHesap(); hesaplar.add(vadeliHesap);
		 * System.out.println("vadeli hesabınız olusturuldu"); }
		 * 
		 * if(bankaHesap.getHesapTuru()=="YatirimHesap") { YatirimHesap yatirimHesap=new
		 * YatirimHesap(); hesaplar.add(yatirimHesap); } } else {
		 * System.out.println("musteri numarası uyusmuyro."); }
		 */
	}

	public void hesapSil(int tcKimlikNo, int musteriNumarasi, String ad, String soyad) {

		/*
		 * System.out.println("Silmek istediginiz hesap numarasini giriniz:"); Scanner
		 * secim = new Scanner(System.in); int hesapNo = secim.nextInt();
		 */

		boolean buHesapMı = false;
		for (BankaHesap hesaplar : hesaplar) {
			buHesapMı = false;
			if (hesaplar.musteriNumarasi == musteriNumarasi) {
				buHesapMı = true;
				break;
			}
		}

		BankaHesap hesap = new BankaHesap();

		
		if (hesap.getIslemMiktar() > (double) 0 && buHesapMı == true) {
			System.out.println("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
		} else if (hesap.islemMiktar == (double) 0 && buHesapMı == true) {
			hesaplar.remove(hesap);
			System.out.println("Hesap basariyla silindi.");
		}

		// System.out.println("Hesap bulunamadi.");

		/*
		 * for(int i=0; i<hesaplar.size();i++) {
		 * if(musteriNumarasi==hesaplar.get(i).musteriNumarasi) {
		 * if(hesaplar.get(i).islemMiktar>0) {
		 * System.out.println("lütfen öncelikle bakiyenizi baska bir hesaba aktariniz");
		 * } else if(hesaplar.get(i).islemMiktar==0) { hesaplar.remove(i);
		 * System.out.println(hesaplar.get(i).hesapTuru+" "+hesaplar.get(i).
		 * musteriNumarasi+" numaralı hesap silindi"); }
		 * 
		 * } else { System.out.println("musteri numarasi uyusmuyor"); } }
		 */

	}

	@Override
	public String toString() {
		return "Musteri [musteriNumarasi=" + musteriNumarasi + ", hesaplar=" + hesaplar + ", krediKartlari="
				+ krediKartlari + ", yillikKazanc=" + yillikKazanc + "]";
	}
	
	

}
