package interno.mygdx.casachorona.model;

import interno.mygdx.casachorona.world.Door;
import interno.mygdx.casachorona.world.Location;
import interno.mygdx.casachorona.world.Scene;

public class PlayerPointer {
	
	private int x;
	private int y;
	private int clickedX;
	private int clickedY;
	private boolean clicked = false;
	private Location currentLocation;
	private PointerType pointerType;
	
	public PlayerPointer(int x, int y) {
		this.x = x;
		this.y = y;
		this.currentLocation = Location.SCENE1;
		this.pointerType = PointerType.DEFAULT;
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
	
	public PointerType getPointerType() {
		return this.pointerType;
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
	
	public void action(Scene currentScene) {
		
		checkForDoor(currentScene);
		
	}
	
	public void checkForDoor(Scene currentScene) {
		Door door = currentScene.checkForDoor(clickedX, clickedY);
		if(door != null) {
			door.interact(this);
		}
	}
}
