package bombIt;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo extends Frame {
	private static final long serialVersionUID = 967705227680672392L;
	private TextField tfMouseClickX, tfMouseClickY;
	private TextField tfMousePositionX, tfMousePositionY;
	
	public MouseMotionDemo() {
		this.setLayout(new FlowLayout());
		
		add(new Label("X-Click: "));
		tfMouseClickX = new TextField(10);
		tfMouseClickX.setEnabled(false);
		add(tfMouseClickX);
		
		add(new Label("Y-Click: "));
		tfMouseClickY = new TextField(10);
		tfMouseClickY.setEnabled(false);
		add(tfMouseClickY);
		
		add(new Label("X-Position: "));
		tfMousePositionX = new TextField(10);
		tfMousePositionX.setEnabled(false);
		add(tfMousePositionX);
		
		add(new Label("Y-Position: "));
		tfMousePositionY = new TextField(10);
		tfMousePositionY.setEnabled(false);
		add(tfMousePositionY);
		
		this.addWindowListener(new myWindowListener());
		myMouseListener listener = new myMouseListener();
		this.addMouseListener(listener);
		this.addMouseMotionListener(listener);
		
		setTitle("MouseMotion Demo");
		setSize(400, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseMotionDemo();
	}
	
	private class myMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			tfMouseClickX.setText(e.getX() + ""); // (x,y) position relative to the source component => window frame here ( (0,0) should be at the top-left of the MouseMotionDemo window))
			tfMouseClickY.setText(e.getY() + "");
		}

		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mouseDragged(MouseEvent e) {
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			tfMousePositionX.setText(e.getX() + "");
	        tfMousePositionY.setText(e.getY() + "");
		}
		
	}
		
	private class myWindowListener implements WindowListener {
	
		@Override
		public void windowOpened(WindowEvent e) {}
	
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	
		@Override
		public void windowClosed(WindowEvent e) {}
	
		@Override
		public void windowIconified(WindowEvent e) {}
	
		@Override
		public void windowDeiconified(WindowEvent e) {}
	
		@Override
		public void windowActivated(WindowEvent e) {}
	
		@Override
		public void windowDeactivated(WindowEvent e) {}
	}
}