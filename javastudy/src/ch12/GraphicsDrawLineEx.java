package ch12;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawLineEx() {
		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200,170);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		
	}

	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
