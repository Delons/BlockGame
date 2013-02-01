
public class Blocks {

	String name;
	int r, g, b, breakTimes;
	
	private static Blocks instance;
	
	public Blocks(String name, int r, int g, int b, int breakTimes){
		this.name = name;
		this.r = r;
		this.g = g;
		this.breakTimes = breakTimes;
	}
	
	Blocks air = new Blocks("air", 154, 213, 248, 0);
	Blocks dirt = new Blocks("dirt", 96, 73, 49, 2);
	Blocks stone = new Blocks("stone", 120, 120, 120, 4);

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getBreakTimes() {
		return breakTimes;
	}
	public void setBreakTimes(int breakTimes) {
		this.breakTimes = breakTimes;
	}
	public Blocks getAir() {
		return air;
	}
	public void setAir(Blocks air) {
		this.air = air;
	}
	public Blocks getDirt() {
		return dirt;
	}
	public void setDirt(Blocks dirt) {
		this.dirt = dirt;
	}
	public Blocks getStone() {
		return stone;
	}
	public void setStone(Blocks stone) {
		this.stone = stone;
	}
	
}
