package mattiemonster.java.window;

import javax.swing.JOptionPane;

public class Engine {
	
	public void stop() {
		System.exit(0);
	}
	
	public static void debugMessage() {
		JOptionPane.showMessageDialog(null, "THIS IS A DEBUG BUILD", "WARNING", JOptionPane.WARNING_MESSAGE);
	}
	
	public static void pointMessage() {
		JOptionPane.showMessageDialog(null, "Application point reached", "Point Reach", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void pointMessageNamed(String pointName) {
		JOptionPane.showMessageDialog(null, "Application point " + pointName + " reached", "Point Reach", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void error() {
		JOptionPane.showMessageDialog(null, "APPLICATION EXPERIENCED ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void errorNamed(String errorName) {
		JOptionPane.showMessageDialog(null, "APPLICATION EXPERIENCED ERROR: " + errorName, "ERROR", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void messageNamed(String messageName) {
		JOptionPane.showMessageDialog(null, messageName, "Message", JOptionPane.PLAIN_MESSAGE);
	}
	
}