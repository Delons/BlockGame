import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel {

	Main main;
	Terrain terrain;
	GUI gui;
	
	int lastTime, currentTime, fps;
	
	public Paint(Main main){
		this.main = main;
		terrain = new Terrain(main);
	}
	
	public void paintComponent(Graphics g){
		
		lastTime = currentTime;
		currentTime = (int) System.currentTimeMillis();
		fps = 1000 / (currentTime - lastTime);
		
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawString("FPS: " + fps, 5, 10);
		
	}
	
}
