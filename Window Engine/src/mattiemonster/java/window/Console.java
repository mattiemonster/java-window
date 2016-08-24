package mattiemonster.java.window;

public class Console {
	
	public void log(String log) {
		System.out.println(log);
	}
	
	public void stopSuccess() {
		System.exit(0);
	}
	
	public void stopFailure() {
		System.exit(-1);
	}
	
	public void stopCustom(int status) {
		System.exit(status);
	}
	
}