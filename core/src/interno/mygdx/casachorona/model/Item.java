package interno.mygdx.casachorona.model;

import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.world.Interactable;

public class Item implements Interactable{

	private int x, y, width, height;
	private ItemType type;
	private boolean pickedUp = true;
	
	public Item(int x, int y, int width, int height, ItemType type) {
		this.x = x * Settings.SCREEN_SCALE;
		this.y = y * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
		this.type = type;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}
	
	public void pickUp() {
		this.pickedUp = true;
	}

	public boolean isPickedUp() {
		return pickedUp;
	}

	@Override
	public boolean interact(PlayerPointer player) {
		System.out.println("item selecionado");
		player.selectsItem(this.type);
		return true;
	}
	
}
