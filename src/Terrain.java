
public class Terrain {

	Main main;
	GUI gui;
	int blockSize = 15;
	int[][] land;
	
	public Terrain(Main main, GUI gui){
		this.main = main;
	}
	
	public void generate(){
		
		land = new int[0][0];
		
	}
	
}
