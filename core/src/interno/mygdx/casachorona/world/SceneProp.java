package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.screen.GameScreen;
import interno.mygdx.casachorona.ui.Inventory;

public class SceneProp implements Interactable {
	
	int x, y, width, height;
	int id;

	public SceneProp(int x, int y, int width, int height, int id) {
		this.x = x * Settings.SCREEN_SCALE;
		this.y = y * Settings.SCREEN_SCALE;
		this.width = width * Settings.SCREEN_SCALE;
		this.height = height * Settings.SCREEN_SCALE;
		this.id = id;
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

	public int getId() {
		return id;
	}

	@Override
	public boolean interact(PlayerPointer player) {
		switch (id) {
		case 0: //lanterna
			if (!player.hasSelectedItem()) {
				Inventory inventory = player.getInventory();
				if (!inventory.hasItem(0)) {
					inventory.foundItem(ItemType.FLASHLIGHT);
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(3)); //pega lanterna
				} else {
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(4)); //segunda vez interagindo
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;

		}
		return true;
	}
}
