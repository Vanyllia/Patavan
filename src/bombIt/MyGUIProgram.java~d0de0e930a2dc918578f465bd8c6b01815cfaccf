// Abstract Windowing Toolkit
package bombIt;

import java.awt.*;
import java.awt.event.*;

public class MyGUIProgram extends Frame {

	private static final long serialVersionUID = 3145875219722855239L; // because we use the java.io.Serializable interface, for more explanation: https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
	private Label lb;
	private TextField tf;
	private Button btn;
	private int count = 0;
	
	public MyGUIProgram() {
		this.setSize(300, 100);
		this.setTitle("AWT Counter");
		
		this.setLayout(new FlowLayout()); // arranges the components from left-to-right + flow to next row from top-to-bottom. 
		// setLayout(null) => would have to specify every component with setBounds (otherwise not visible)!
		
		
		lb = new Label("Counter", Label.LEFT);
		this.add(lb);
		
		tf = new TextField(count + "", 10);
		tf.setEditable(false);
		this.add(tf);
		
		btn = new Button("Count");
		this.add(btn);
		 
		ButtonActionListener listener = new ButtonActionListener(); // ActionEvent listener => provides an ActionEvent => actionPerformed()
		btn.addActionListener(listener); //  action performed by user => action event occurs => actionPerformed message is sent to all action listeners that are registered on the relevant component.
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyGUIProgram program = new MyGUIProgram();
		
	}
		
	private class ButtonActionListener implements ActionListener { 
		
		@Override 
		public void actionPerformed(ActionEvent e) { // e =  ActionEvent object that gives information about the event and its source.
			count++;
			tf.setText(count + "");
		}
	}
	
}