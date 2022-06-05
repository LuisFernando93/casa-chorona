package interno.mygdx.casachorona.model;

import interno.mygdx.casachorona.ui.Inventory;
import interno.mygdx.casachorona.world.Door;
import interno.mygdx.casachorona.world.Location;
import interno.mygdx.casachorona.world.Scene;
import interno.mygdx.casachorona.world.World;

public class PlayerPointer {
	
	private int x;
	private int y;
	private int clickedX;
	private int clickedY;
	private boolean clicked = false;
	private Location currentLocation;
	private PointerType pointerType;
	private World world;
	private Inventory inventory;
	
	public PlayerPointer(int x, int y, World world, Inventory inventory) {
		this.x = x;
		this.y = y;
		this.currentLocation = Location.SCENE1;
		this.pointerType = PointerType.DEFAULT;
		this.world = world;
		this.inventory = inventory;
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
		Item item = inventory.getItem(x, y);
		if (item != null && item.isPickedUp()) {
			this.pointerType = PointerType.HIGHLIGHT;
			return;
		}
		Scene scene = world.findCurrentScene(this.currentLocation);
		Door door = scene.getDoor(x, y);
		if (door != null) {
			this.pointerType = door.getPointerType();
			return;
		} 
		this.pointerType = PointerType.DEFAULT;
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
	
	public void action() {
		
		if (checkForItem()) {
			return;
		}
		checkForDoor();
		
	}
	
	public boolean checkForItem() {
		Item item = inventory.getItem(clickedX, clickedY);
		if(item != null) {
			if (item.interact(this)) {
				//mudar ponteiro
			}
			return true;
		}
		return false;
	}
	
	public void checkForDoor() {
		Scene currentScene = world.findCurrentScene(this.currentLocation);
		Door door = currentScene.getDoor(clickedX, clickedY);
		if(door != null) {
			if (door.interact(this)) {
				this.pointerType = PointerType.DEFAULT;
			}
		}
	}
	
	public void render(float delta) {
		
	}
}
