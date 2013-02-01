import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class ListenerKey extends JPanel implements KeyListener {
 
	private Paint paint = Paint.getInstance();
	
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_F1) {
			System.out.println("xd");
				if(paint.isShowStats() == true){
					paint.setShowStats(false);
				} else {
					paint.setShowStats(true);
				}
			}
		
	}

	public void keyReleased(KeyEvent arg0) {

	}

	public void keyTyped(KeyEvent arg0) {

	}

}
