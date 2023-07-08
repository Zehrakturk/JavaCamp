package Zehra_akturk;

import java.util.Calendar;
import java.util.Date;

public class VadeliHesap extends BankaHesap{

	public String hesapTuru;
	public int vadeliBakiye;
	public float faizOrani;
	
	
	//getter ve setter methodları
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	public int getVadeliBakiye() {
		return vadeliBakiye;
	}
	public void setVadeliBakiye(int vadeliBakiye) {
		this.vadeliBakiye = vadeliBakiye;
	}
	public float getFaizOrani() {
		return faizOrani;
	}
	public void setFaizOrani(float faizOrani) {
		this.faizOrani = faizOrani;
	}
	
	
	//parametresiz constuctor
	public VadeliHesap() {
		
	}
	
	public VadeliHesap(String hesapTuru, int vadeliBakiye, float faizOrani,int musteriNumarasi) {
		Calendar zaman = Calendar.getInstance();
		Date suan =  zaman.getTime();
		this.hesapAcilisTarih = suan; 
		
		this.hesapTuru = hesapTuru;
		this.vadeliBakiye = vadeliBakiye;
		this.toplamBakiye=vadeliBakiye;
		this.faizOrani = faizOrani;
		this.musteriNumarasi=musteriNumarasi;//bunu eklememin sebebi musteri classı içerisinde hesapsil methodunu kullanırken hesabın o musteriye ait olup olmadığını kontrol edebilmek
	}
	
	
	
	@Override
	public String toString() {
		return "VadeliHesap [hesapTuru=" + hesapTuru + ", vadeliBakiye=" + vadeliBakiye + ", faizOrani=" + faizOrani
				+ "]";
	}
	
	
}
