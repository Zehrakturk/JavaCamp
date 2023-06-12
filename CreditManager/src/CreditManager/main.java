package odev35_37;

public class main {

	public static void main(String[] args) {

		Costumer costumer=new Costumer();
		Employee employee=new Employee();

		EmployeeManager employeeMannager=new EmployeeManager();
		CostumerManager costumerManager=new CostumerManager();
		costumerManager.Add();
		employeeMannager.BestEmployee();
		
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesaplama(new OgretmenKrediManager());
	}

}
