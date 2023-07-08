package Zehra_akturk;

public class Kisi {

	private int tcKimlikNo;
	private String ad;
	private String soyad;
	private String email;
	private int telefonNumarasi;

	// getter ve setter metodları
	public int getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefonNumarasi() {
		return telefonNumarasi;
	}

	public void setTelefonNumarasi(int telefonNumarasi) {
		this.telefonNumarasi = telefonNumarasi;
	}

//parametreli constuctor oluşturduğumuz için java bizim için parametresiz constructor oluşturmaz. 
	public Kisi() {

	}

	public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.tcKimlikNo=tcKimlikNo;
		this.telefonNumarasi=telefonNumarasi;

	}

	@Override
	public String toString() {
		return "Kisi [tcKimlikNo=" + tcKimlikNo + ", ad=" + ad + ", soyad=" + soyad + ", email=" + email
				+ ", telefonNumarasi=" + telefonNumarasi + "]";
	}

}
