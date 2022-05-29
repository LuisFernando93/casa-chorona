package interno.mygdx.casachorona.world;

public class Door {

	private int x,y;
	private int width,height;
	private Location goesTo;
	
	public Door(int x, int y, int width, int height, Location goesTo) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.goesTo = goesTo;
		System.out.println("x = " + this.x + " y = " + this.y + " x2 = " + (this.width + this.x) + " y2 = " + (this.height + this.y));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public Location getGoesTo() {
		return goesTo;
	}
	
}
