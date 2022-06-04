package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.PlayerPointer;

public class Door implements Interactable{

	private int x,y;
	private int width,height;
	private Location goesTo;
	
	public Door(int x, int y, int width, int height, Location goesTo, boolean locked) {
		this.x = x  * Settings.SCREEN_SCALE;
		this.y = y  * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
		this.goesTo = goesTo;
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

	@Override
	public void interact(PlayerPointer player) {
		player.setCurrentLocation(this.goesTo);
	}
	
}
