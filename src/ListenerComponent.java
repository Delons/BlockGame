import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;


public class ListenerComponent extends JPanel implements ComponentListener{

	private GUI gui = GUI.getInstance();
	
	public void componentHidden(ComponentEvent e) {

	}

	public void componentMoved(ComponentEvent e) {
		
	}

	public void componentResized(ComponentEvent e) {		
		gui.setfX(gui.getF().getSize().width);
		gui.setfY(gui.getF().getSize().height);
	}

	public void componentShown(ComponentEvent e) {
		
	}

}
