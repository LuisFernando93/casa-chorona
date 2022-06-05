package interno.mygdx.casachorona.model;

import interno.mygdx.casachorona.game.Settings;

public class Item {

	private int x, y, width, height;
	
	public Item(int x, int y, int width, int height) {
		this.x = x * Settings.SCREEN_SCALE;
		this.y = y * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
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
	
	public void render(float delta) {
		
	}
}
