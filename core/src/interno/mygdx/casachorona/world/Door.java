package interno.mygdx.casachorona.world;

import audio.SoundPlayer;
import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.model.PointerType;
import interno.mygdx.casachorona.screen.GameScreen;

public class Door implements Interactable{

	private int x,y;
	private int width,height;
	private Location goesTo;
	private PointerType pointerType;
	private boolean locked, stair;
	private ItemType key;
	
	
	public Door(int x, int y, int width, int height, Location goesTo, boolean locked, ItemType key, boolean stair, PointerType type) {
		this.x = x  * Settings.SCREEN_SCALE;
		this.y = y  * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
		this.goesTo = goesTo;
		this.pointerType = type;
		this.locked = locked;
		this.key = key;
		this.stair = stair;
		if (this.locked && key == null) {
			this.locked = false;
		}
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
	public boolean interact(PlayerPointer player) {
		if (!player.hasSelectedItem()) {
			if (!this.isLocked()) {
				player.setCurrentLocation(this.goesTo);
				if (stair) {
					SoundPlayer.playSFX("stair");
				} else {
					SoundPlayer.playSFX("door");
				}
				return true;
			} else if (this.key == ItemType.FLASHLIGHT) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(5)); //porta da garagem trancada
				return false;
			} else {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(0)); //porta trancada
			return false;
			}
		} else {
			if (this.isLocked()) {
				if (player.getSelectedItemType() == this.key) {
					this.locked = false;
					if (this.key == ItemType.FLASHLIGHT) {
						GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(6));
					} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(1)); //destranca porta
				} else {
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
				}
			} else {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			}
		}
		return false;
		
	}
	
}
