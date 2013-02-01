import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel {

	private Terrain terrain;
	private GUI gui;
	
	private int lastTime, currentTime, fps;
	
	private static Paint paint;
	public static Paint getInstance()
	{
		if(paint == null){
			paint = new Paint();
		}
		return paint;
	}
	
	public Paint(){
		terrain = new Terrain();
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
