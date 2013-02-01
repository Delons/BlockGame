
public class Main {
	
	public void startGame(){
		
		Terrain.getInstance().generate();
		GUI.getInstance().draw();
		
	}
	
	public static void main(String args[]){
		new Main().startGame();
	}
		
}
