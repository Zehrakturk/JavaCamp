package odev2;

public class StudentManager extends UserManager{

	public void startExam(Student student) {
		System.out.println("Sinav baslatildi.");
		
	}
	
	public void enterNot(Student student) {
		System.out.println("Notlar girildi.");
	}
	
	public void addLesson(Student student ) {
		System.out.println("Ders ekleme basarili!!!");
	}
	public void confirmLesson(Student student) {
		System.out.println("Ders kaydi onaylandi!!");
	}
}
