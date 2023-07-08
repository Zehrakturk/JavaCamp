package Zehra_akturk;

import java.util.ArrayList;
import java.util.List;

public class BankaPersonel extends Kisi {

	private int personelID;
	public ArrayList<Musteri> musteriler=new ArrayList(); 
	
	//getter ve setter methodları
	public int getPersonelID() {
		return personelID;
	}

	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}

	public ArrayList<Musteri> getMusteriler() {
		return musteriler;
	}

	public void setMusteriler(ArrayList<Musteri> musteriler) {
		this.musteriler = musteriler;
	}

	
	//parametresiz constructor
	public BankaPersonel() {
		super();
	}

	public BankaPersonel(int tcKimlikNo,String ad, String soyad, String email, int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		this.musteriler=musteriler;
		
	}
	
	@Override
	public String toString() {
		return "BankaPersonel [personelID=" + personelID + ", musteriler=" + musteriler + "]";
	}
	
	
	
	
	
	
}
