package video_4;

public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers={new FileLogger(),new SmsLogger()};
		CustomerManager customerManager= new CustomerManager(loggers);
		Customer zehra =new Customer(1,"Zehra","Akturk");
		customerManager.add(zehra);
		
	}

}
