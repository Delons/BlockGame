import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel {

	Main main;
	Terrain terrain;
	GUI gui;
	
	public Paint(Main main){
		this.main = main;
		terrain = new Terrain(main);
		gui = new GUI(main);
	}
	
	public void paintComponent(Graphics g){
		gui.lastTime = gui.currentTime;
		gui.currentTime = (int) System.currentTimeMillis();
		gui.fps = 1000 / (gui.currentTime - gui.lastTime);
		
		super.paintComponent(g);
		
		g.setColor(new Color(255, 255, 255));
		g.drawString("FPS: " + gui.fps, 5, 5);
		
	}
	
}
