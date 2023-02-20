package odev_3;

public class GamerManager implements GamerManagerService
{
	GamerCheckServes gamerCheckServes;
	
	public GamerManager(Gamer gamer, GamerCheckServes gamerCheckServes)
	{
		this.gamerCheckServes=gamerCheckServes;
	}
	
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckServes.CheckSevice(gamer)) {
			System.out.println("Sisteme kaydiniz yapildi.");
		}else {
			System.out.println("Kayit yapilamadi.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Bilgileriniz guncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kaydiniz silindi.");
	}
	

}
