package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.cutscene.CutscenePlayer;
import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.screen.GameScreen;
import interno.mygdx.casachorona.ui.Inventory;

public class SceneProp implements Interactable {
	
	private int x, y, width, height;
	private int id;
	private boolean interacted = false;

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
		case 1: 
			if (!player.hasSelectedItem()) {
				Inventory inventory = player.getInventory();
				if (World.hasArrivedScene9()) {
					if (!inventory.hasItem(4)) {
						inventory.foundItem(ItemType.HAMMER);
						GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(26)); //pega martelo
					} else {
						GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(27)); //ja pegou o martelo
					}
				} else {
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(7)); //nao pega o martelo
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 2:
			if (!player.hasSelectedItem()) {
				Inventory inventory = player.getInventory();
				if (!inventory.hasItem(1)) {
					inventory.foundItem(ItemType.KEY1);
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(15)); //pega chave1
				} else {
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(16)); //segunda vez interagindo
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 3: //tenda cena9
			if (!player.hasSelectedItem()) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(18));
				if(!this.interacted) {
					this.interacted = true;
					World.incrementPropsInteractedScene9();
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 4: //cama cena9
			if (!player.hasSelectedItem()) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(17));
				if(!this.interacted) {
					this.interacted = true;
					World.incrementPropsInteractedScene9();
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 5: //bau cena9
			if (!player.hasSelectedItem()) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(20));
				if(!this.interacted) {
					this.interacted = true;
					World.incrementPropsInteractedScene9();
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 6: //poster cena9
			if (!player.hasSelectedItem()) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(19));
				if(!this.interacted) {
					this.interacted = true;
					World.incrementPropsInteractedScene9();
				}
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 7:
			if (!player.hasSelectedItem()) {
				Inventory inventory = player.getInventory();
				if(inventory.hasItem(3)) {
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(24)); //ja pegou a chave
				} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(22)); //cofre esta trancado
			} else {
				Inventory inventory = player.getInventory();
				if(!inventory.hasItem(3) && player.getSelectedItemType() == ItemType.PASSWORD)  {
					inventory.foundItem(ItemType.KEY2);
					GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(23)); //pega a chave do sotao
				} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			}
			break;
		case 8:
			if (!player.hasSelectedItem()) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(25)); //bau trancado
			} else if (player.getSelectedItemType() == ItemType.HAMMER) {
				//fim de jogo
				CutscenePlayer.setActiveCutscene(5);
				GameScreen.setGameState("cutscenePlayer");
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		case 9:
			if (!player.hasSelectedItem()) {
				if (!World.hasArrivedFrontDoor()) {
					World.interactFrontDoor();
					CutscenePlayer.setActiveCutscene(3);
					GameScreen.setGameState("cutscenePlayer");
				} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(31));
			} else if (player.getSelectedItemType() == ItemType.HAMMER) {
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(32));
			} else GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(2)); //item errado
			break;
		}
		return true;
	}
}
