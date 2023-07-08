package Zehra_akturk;

public class KrediKarti {

	private int kartNumarasi;
	public double limit;
	public double guncelBorc;
	
	//getter ve setter methodları
	public int getKartNumarasi() {
		return kartNumarasi;
	}
	public void setKartNumarasi(int kartNumarasi) {
		this.kartNumarasi = kartNumarasi;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc = guncelBorc;
	}
	
	
	
	//parametresiz constuctor
	public KrediKarti() {
		
	}
	
	public KrediKarti(int kartNumarasi , double limit, double guncelBorc, int kullanilabilirLimit) {
		this.kartNumarasi=kartNumarasi;
		this.limit=limit;
		this.guncelBorc=guncelBorc;
		kullanilabilirLimit=(int) kullanilabilirLimit(kartNumarasi, guncelBorc);
	}
	
	//UML diagramında istenen methodlar
	public void krediKartiEkle(int kartNumarasi,double limit,Musteri musteri,KrediKarti krediKarti)
	{//o musterinini arraylistine ekleyebilmek için bu parametreyi almam gerekiyordu.
	//kredi kartini main de olusturup ekleyebilmek icin kredi karti parametresi de aldim.
		
		musteri.krediKartlari.add(krediKarti);
	}
	
	public void krediKartıSil(Musteri musteri,KrediKarti krediKarti)
	{
		//kredi kartini parametre olarak aldığım icin guncel borcu limiti ve kart numarasini kredi karti üzerinde erişebiliyorum.
		//bu yüzden parametreler arasından güncel borcu kart numarasini ve limiti sildim.
		//musterinini arraylistinden silebilmek için musteriyi parametre olarak almam gerekiyordu.
		//kredi kartini main de olusturup kullanabilmek icin kredi karti parametresini de aldim.
		if(krediKarti.guncelBorc!=0) {
			System.out.println("Lutfen oncelikle borc odemesi yapiniz");
		}
		else {
			musteri.krediKartlari.remove(krediKarti);
			System.out.println("Kredi kartiniz silinmistir.");
		}
		
	}
	
	public double kullanilabilirLimit(int kartNumarasi ,double guncelBorc) {
		
		Musteri musteri=new Musteri();
		double kullanilabilirLimit=0;
		int i;
		for(i=0;i<musteri.krediKartlari.size();i++) {
			if(musteri.krediKartlari.get(i).kartNumarasi==kartNumarasi) {//burada kart numaramiza ait musteriler sinifinin icinde array liste kayitli olan kredi karti nesnemizi buluyoruz.
				kullanilabilirLimit=(double)musteri.krediKartlari.get(i).limit-musteri.krediKartlari.get(i).guncelBorc;
				return kullanilabilirLimit;
			}
			else {
				System.out.println("Yanlis kart numarasi girdiniz. Boyle bir kart bulunamadi.");
				return (double)0.0;
			}
		}
		return kullanilabilirLimit;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "KrediKarti [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc
				+ ", getKartNumarasi()=" + getKartNumarasi() + ", getLimit()=" + getLimit() + ", getGuncelBorc()="
				+ getGuncelBorc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
}
