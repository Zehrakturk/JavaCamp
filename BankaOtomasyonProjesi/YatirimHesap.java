package Zehra_akturk;

import java.util.Calendar;
import java.util.Date;

public class YatirimHesap extends BankaHesap{

	public String hesapTuru;
	public double yatirimBakiye;//paraEkle fonksiyonun geriye döndürmesi gereken değer double yatirimBakiye ,
								//ve geriye döndürülecek olan degerin veri tipi int bu yüzden yatiirmBakiyenin veri tipini burada double olarak değiştiriyorum.
	public String yatirimTuru;
	public float kur;
	
	//getter ve setter methodları 
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	public double getYatirimBakiye() {
		return yatirimBakiye;
	}
	public void setYatirimBakiye(double yatirimBakiye) {
		this.yatirimBakiye = yatirimBakiye;
	}
	public String getYatirimTuru() {
		return yatirimTuru;
	}
	public void setYatirimTuru(String yatirimTuru) {
		this.yatirimTuru = yatirimTuru;
	}
	public float getKur() {
		return kur;
	}
	public void setKur(float kur) {
		this.kur = kur;
	}
	
	
	//parametresiz constructor
	public YatirimHesap() {
		
	}
	
	public YatirimHesap(String hesapTuru, int yatirimBakiye, String yatirimTuru, float kur,int musteriNumarasi) {
		Calendar zaman = Calendar.getInstance();
		Date suan =  zaman.getTime();
		this.hesapAcilisTarih = suan; 
		
		this.hesapTuru = hesapTuru;
		this.yatirimBakiye = yatirimBakiye;
		this.toplamBakiye=yatirimBakiye;
		this.yatirimTuru = yatirimTuru;
		this.kur = kur;
		this.musteriNumarasi=musteriNumarasi;//bunu eklememin sebebi musteri classı içerisinde hesapsil methodunu kullanırken
											//hesabın o musteriye ait olup olmadığını kontrol edebilmek
	}
	
	public double paraEkle(double yatirimBakiye, String yatirimTuru,float kur,double yatirilanMiktar) {//kur ile yatirilan para miktarini çarpabilmemiz için bu parametreyi ekledim.

		yatirimBakiye+=(int) ((int)kur*yatirilanMiktar);//fonksiyonun geriye döndürmesi gereken değer double yatirimBakiye 
														//ve geriye döndürülecek olan degerin veri tipi int bu yüzden yatirimBakiyenin veri tipini burada double olarak değiştiriyorum.
		return yatirimBakiye;
	}
	
	public double paraBoz(double yatirimBakiye, String yatirimTuru, float kur,double bozulacakMiktar) {//buradaki bozulacak miktar değişkeni 
																									   //mesela 1.2 gram altın bozmak istedi bu miktari tutuyor		
		yatirimBakiye-=bozulacakMiktar*kur;
		return yatirimBakiye;
	}
	
	
	
	@Override
	public String toString() {
		return "YatirimHesap [hesapTuru=" + hesapTuru + ", yatirimBakiye=" + yatirimBakiye + ", yatirimTuru="
				+ yatirimTuru + ", kur=" + kur + "]";
	}
}
