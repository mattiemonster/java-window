package mattiemonster.java.window;

public class Main {
	
	public static void main(String args[]) {
		DisplayProvider dis = new DisplayProvider();
		
		dis.init();
		
		// Engine messages testing
		Engine.debugMessage();
		Engine.error();
		Engine.errorNamed("ERROR NAMED");
		Engine.messageNamed("This is a message");
		Engine.pointMessage();
		Engine.pointMessageNamed("Point 1");
	}
	
}