import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {

	Terrain terrain;
	Paint paint;

	int setFPS = 60;
	
	Timer redraw = new Timer();
	
	private static GUI instance;
	
	public static GUI getInstance(){
		if(instance == null){
			instance = new GUI();
		}
		return instance;
	}
	
	public GUI() {
		terrain = new Terrain();
		paint = new Paint();
	}

	JFrame f = new JFrame("Block Game");

	public void draw() {

		redraw.schedule(draw, 1000 / setFPS, 1000 / setFPS);
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	ListenerKey key = new ListenerKey();
	ListenerMouse mouse = new ListenerMouse();
	
	f.add(key);
	f.add(mouse);
	
	f.add(paint);
	
	}
	
	TimerTask draw = new TimerTask(){
		public void run(){
			f.repaint();
		}
	};
}
