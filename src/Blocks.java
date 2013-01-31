
public class Blocks {

	String name;
	
	public Blocks(String name, int r, int g, int b){
		this.name = name;
	}
	
	Blocks air = new Blocks("air", 154, 213, 248);
	Blocks dirt = new Blocks("dirt", 96, 73, 49);
	Blocks stone = new Blocks("stone", 120, 120, 120);
	
}
