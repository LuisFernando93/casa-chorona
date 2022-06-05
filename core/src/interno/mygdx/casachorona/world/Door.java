package interno.mygdx.casachorona.world;

import audio.SoundPlayer;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.model.PointerType;

public class Door implements Interactable{

	private int x,y;
	private int width,height;
	private Location goesTo;
	private PointerType pointerType;
	private boolean locked, stair;
	
	
	public Door(int x, int y, int width, int height, Location goesTo, boolean locked, boolean stair, PointerType type) {
		this.x = x  * Settings.SCREEN_SCALE;
		this.y = y  * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
		this.goesTo = goesTo;
		this.pointerType = type;
		this.locked = locked;
		this.stair = stair;
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
	
	public PointerType getPointerType() {
		return this.pointerType;
	}
	
	public boolean isLocked() {
		return this.locked;
	}
	
	public boolean isStair() {
		return this.stair;
	}

	@Override
	public void interact(PlayerPointer player) {
		player.setCurrentLocation(this.goesTo);
		if (stair) {
			SoundPlayer.playSFX("stair");
		} else {
			SoundPlayer.playSFX("door");
		}
	}
	
}
