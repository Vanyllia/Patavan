package bombIt;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {

	private static final long serialVersionUID = -6899030969559939561L;
	// private Label lbInput, lbOutput;
	 private TextField tfInput, tfOutput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new GridLayout(2,2));
		
//		lbInput = new Label("Enter an Integer:");
//		lbOutput = new Label("The Accumulated Sum is:");
//		add(lbInput);
//		add(lbOutput);

		add(new Label("Enter an Integer:")); // won't reference this Label later => can add anonymous Label!
		
		tfInput = new TextField(10); // String = "" for this constructor!
		add(tfInput);
		
		tfInput.addActionListener(new TFInputListener()); // more concise with anonymous instance + Hitting "enter" on tfInput invokes actionPerformed()
		
		add(new Label("The Accumulated Sum is:"));
		
		tfOutput = new TextField(sum + "", 10); // #cols doesn't seem to make a difference (e.g. 10 vs 1)
		tfOutput.setEnabled(false);
		add(tfOutput);
		

		setSize(350,120);
		setTitle("AWTAccumulator");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTAccumulator(); // anonymous instance => just calls constructor anyway!
		
	}
	
	private class TFInputListener implements ActionListener { // should be set to private! + since it listens to the variable tfInput => choose name that way!

		@Override
		public void actionPerformed(ActionEvent e) {
			sum += Integer.parseInt(tfInput.getText());
			// tfOutput.setText(""); => doesn't make a visible difference (imo)
			tfOutput.setText(sum + "");
			
		}
		
	}

}
