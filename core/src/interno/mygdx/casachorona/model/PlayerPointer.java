package interno.mygdx.casachorona.model;

import com.badlogic.gdx.math.Vector2;

public class PlayerPointer {
	
	private int x;
	private int y;
	private int clickedX;
	private int clickedY;
	private boolean clicked = false;
	
	public PlayerPointer(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void movePointer(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isClicked() {
		if (this.clicked) {
			this.clicked = false;
			return true;
		} else return false;
	}
	
	public void hasClicked(int x, int y) {
		this.clicked = true;
		this.clickedX = x;
		this.clickedY = y;
	}
	
	public Vector2 clickLocation() {
		Vector2 click = new Vector2(clickedX, clickedY);
		return click;
	}
}
