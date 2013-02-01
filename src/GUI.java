import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {
	
	private int setFPS = 60;
	
	private Timer redraw = new Timer();
	private static GUI instance;
	private JFrame f = new JFrame("Block Game");
	int fX = 500, fY = 500;
	
	public static GUI getInstance(){
		if(instance == null){
			instance = new GUI();
		}
		return instance;
	}
	
	public void draw() {

		redraw.schedule(draw, 1000 / setFPS, 1000 / setFPS);
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	ListenerKey key = new ListenerKey();
	ListenerMouse mouse = new ListenerMouse();
	ListenerComponent component = new ListenerComponent();
	
	f.add(key);
	f.add(mouse);
	f.add(component);
	
	f.add(Paint.getInstance());
	
	}

	TimerTask draw = new TimerTask(){
		public void run(){
			f.repaint();
		}
	};	
	
	public JFrame getF() {
		return f;
	}

	public void setfX(int fX) {
		this.fX = fX;
	}

	public void setfY(int fY) {
		this.fY = fY;
	}
}
