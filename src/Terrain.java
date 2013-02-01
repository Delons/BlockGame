
public class Terrain {

	//Small = 10 Medium = 20 Large = 40
	private int blockSize = 20;	
	private int[][] land;
	
	private static Terrain instance;
	
	public static Terrain getInstance() {
		if (instance == null) {
			instance = new Terrain();
		}
		return instance;
	}
	
	public void generate(){
		
		land = new int[0][0];
		
	}

	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}

}
