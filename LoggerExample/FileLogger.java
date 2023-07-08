package video_4;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Dosyaya loglandi: "+message);
	}

}
