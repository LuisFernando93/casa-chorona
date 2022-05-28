package interno.mygdx.casachorona.model;

import com.badlogic.gdx.math.Vector2;

import interno.mygdx.casachorona.world.Location;

public class PlayerPointer {
	
	private int x;
	private int y;
	private int clickedX;
	private int clickedY;
	private boolean clicked = false;
	private Location currentLocation;
	
	public PlayerPointer(int x, int y) {
		this.x = x;
		this.y = y;
		this.currentLocation = Location.SCENE2;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public Location getCurrentLocation() {
		return this.currentLocation;
	}
	
	public void setCurrentLocation(Location currentLocation) {
		this.currentLocation = currentLocation;
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
