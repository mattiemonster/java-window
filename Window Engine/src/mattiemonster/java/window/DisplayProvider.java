package mattiemonster.java.window;

import java.awt.Dimension;

import javax.swing.JFrame;

public class DisplayProvider {
	
	JFrame frame = new JFrame("Default Display");
	
	boolean created = false;

	public DisplayProvider() {
		created = true;
	}
	
	public void setTitleCustom(String title) {
		frame.setTitle(title);
	}
	
	public void setDebugTitle() {
		frame.setTitle("DISPLAY - DEBUGGING MODE");
	}
	
	public void setReleaseTitle() {
		frame.setTitle("Display");
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void init() {
		System.out.println("Engine:   Init window.");
		create();
	}
	
	public void setSize(int width, int height) {
		frame.setSize(width, height);
	}
	
	public void setSize(Dimension size) {
		frame.setSize(size);
	}
	
	public void create() {
		frame.setSize(1024, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}