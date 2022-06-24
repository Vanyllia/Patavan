// Abstract Windowing Toolkit
package bombIt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame {

	private static final long serialVersionUID = 3145875219722855239L; // because we use the java.io.Serializable interface, for more explanation: https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private TextField tf;
	private Button btn;
	private int count = 0;
	
	public AWTCounter() {
		this.setSize(300, 100);
		this.setTitle("AWT Counter");
		
		this.setLayout(new FlowLayout()); // arranges the components from left-to-right + flow to next row from top-to-bottom. 
		// setLayout(null) => would have to specify every component with setBounds (otherwise not visible)!
		
		
		this.add(new Label("Counter"));
		
		tf = new TextField(count + "", 10);
		tf.setEditable(false);
		this.add(tf);
		
		btn = new Button("Count");
		this.add(btn);
		 
		ButtonActionListener listener = new ButtonActionListener(); // ActionEvent listener => provides an ActionEvent => actionPerformed()
		btn.addActionListener(listener); //  action performed by user => action event occurs => actionPerformed message is sent to all action listeners that are registered on the relevant component.
		
		this.addWindowListener(new MyWindowListener()); // don't add it to btn => want the window to close, not the button xd
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTCounter program = new AWTCounter();
		
	}
		
	private class ButtonActionListener implements ActionListener { 
		
		@Override 
		public void actionPerformed(ActionEvent e) { // e =  ActionEvent object that gives information about the event and its source.
			count++;
			tf.setText(count + "");
		}
	}
	
	private class MyWindowListener implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("Window Iconified");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Window Deiconified");
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("Window Activated");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Window Deactivated");
			
		}
		
	}
	
}