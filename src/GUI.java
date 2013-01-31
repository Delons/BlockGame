import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel {

	Main main;
	Terrain terrain;
	Paint paint;

	public GUI(Main main) {
		terrain = new Terrain(main);
		paint = new Paint(main);
		this.main = main;
	}

	JFrame f = new JFrame("Block Game");

	public void draw() {

		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	ListenerKey key = new ListenerKey();
	ListenerMouse mouse = new ListenerMouse();
	
	f.add(key);
	f.add(mouse);
	
	f.add(paint);
	}

}
