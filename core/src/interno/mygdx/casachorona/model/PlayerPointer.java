package interno.mygdx.casachorona.model;

import interno.mygdx.casachorona.ui.Inventory;
import interno.mygdx.casachorona.world.Door;
import interno.mygdx.casachorona.world.Location;
import interno.mygdx.casachorona.world.Scene;
import interno.mygdx.casachorona.world.SceneProp;
import interno.mygdx.casachorona.world.World;

public class PlayerPointer {
	
	private int x;
	private int y;
	private int clickedX;
	private int clickedY;
	private boolean clicked = false;
	private Location currentLocation = Location.SCENE1;
	private PointerType pointerType = PointerType.DEFAULT;
	private World world;
	private Inventory inventory;
	private boolean selectedItem = false;
	private ItemType selectedItemType = null;
	
	public PlayerPointer(int x, int y, World world, Inventory inventory) {
		this.x = x;
		this.y = y;
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
		if(!this.selectedItem) {
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
			SceneProp prop = scene.getProp(x, y);
			if (prop != null) {
				this.pointerType = PointerType.HIGHLIGHT;
				return;
			}
			this.pointerType = PointerType.DEFAULT;
		}
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
	
	public boolean hasSelectedItem() {
		return this.selectedItem;
	}
	
	public void selectsItem(ItemType type) {
		this.selectedItem = true;
		this.selectedItemType = type;
	}
	
	public ItemType getSelectedItemType() {
		return this.selectedItemType;
	}
	
	public Inventory getInventory() {
		return this.inventory;
	}
	
	public void action() {
		
		if (checkForItem()) {
			return;
		}
		checkForDoor();
		checkForProp();
		this.selectedItem = false;
		this.pointerType = PointerType.DEFAULT;
	}
	
	public boolean checkForItem() {
		Item item = inventory.getItem(clickedX, clickedY);
		if(item != null) {
			item.interact(this);
			switch (item.getType()) {
			case FLASHLIGHT:
				this.pointerType = PointerType.FLASHLIGHT;
				break;
			case HAMMER:
				this.pointerType = PointerType.HAMMER;
				break;
			case PASSWORD:
				this.pointerType = PointerType.PASSWORD;
				break;
			case KEY1:
				this.pointerType = PointerType.KEY1;
				break;
			case KEY2:
				this.pointerType = PointerType.KEY2;
				break;
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
	
	public void checkForProp() {
		Scene currentScene = world.findCurrentScene(this.currentLocation);
		SceneProp prop = currentScene.getProp(clickedX, clickedY);
		if (prop != null) {
			prop.interact(this);
		}
	}
	
	public void render(float delta) {
		
	}
}
