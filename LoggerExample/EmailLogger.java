package video_4;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Email loglandi: "+ message);
		
	}


}
