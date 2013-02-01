import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel {

	public boolean showStats = false;

	private GUI gui = GUI.getInstance();

	public boolean isShowStats() {
		return showStats;
	}

	public void setShowStats(boolean showStats) {
		this.showStats = showStats;
	}

	private int lastTime, currentTime, fps;

	private static Paint paint;

	public static Paint getInstance() {
		if (paint == null) {
			paint = new Paint();
		}
		return paint;
	}

	public Paint() {
	}

	public void paintComponent(Graphics g) {

		lastTime = currentTime;
		currentTime = (int) System.currentTimeMillis();
		if (currentTime - lastTime != 0) {
			fps = 1000 / (currentTime - lastTime);
		}

		super.paintComponent(g);

		if (showStats == true) {
			g.setColor(Color.BLACK);
			
			
			g.drawString("FPS: " + fps, 5, 15);
			
			g.drawString(
					"Frame Size: X: " + gui.getfX() + " Y: " + gui.getfY(), 75,
					15);
			g.drawString("Char Pos: ", 300, 15);
		}
	}
}
