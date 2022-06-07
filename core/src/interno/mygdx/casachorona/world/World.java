package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PointerType;
import interno.mygdx.casachorona.screen.GameScreen;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 9;
	private static boolean metFanta = false;
	private static boolean arrivedScene3 = false;
	private static boolean arrivedScene4 = false;
	private static boolean arrivedScene5 = false;
	private static boolean arrivedScene6 = false;
	private static boolean arrivedScene7 = false;
	private static boolean arrivedScene8 = false;
	private static boolean arrivedScene9 = false;


	public World() {
		this.scenes = new Scene[nScenes];
		createWorld();
	}
	
	public static boolean hasMeetFanta() {
		return World.metFanta;
	}
	
	public static boolean hasArrivedScene9() {
		return World.arrivedScene9;
	}
	
	public void createWorld() {
		
		scenes[0] = new Scene(Location.SCENE1, 1, 2);
		
		scenes[0].addDoor(new Door(420, 134, 27, 114, Location.SCENE2, true, ItemType.FLASHLIGHT, false, PointerType.RIGHT)); //porta direita
		
		scenes[0].addProp(new SceneProp(313, 282, 37, 15, 0)); //lanterna
		scenes[0].addProp(new SceneProp(439, 275, 22, 28, 1));
		
		
		scenes[1] = new Scene(Location.SCENE2, 2, 0);
		scenes[1].addDoor(new Door(0, 138, 12, 160, Location.SCENE1, false, null, false, PointerType.LEFT));   //porta esquerda
		scenes[1].addDoor(new Door(468, 137, 12, 160, Location.SCENE3, false, null, false, PointerType.RIGHT)); //porta direita
		
		scenes[2] = new Scene(Location.SCENE3, 3, 0);
		scenes[2].addDoor(new Door(8, 139, 39, 139, Location.SCENE6, true, ItemType.KEY1, false, PointerType.LEFT));    //porta esquerda 
		scenes[2].addDoor(new Door(172, 290, 135, 30, Location.SCENE2, false, null, false, PointerType.DOWN));  //porta atras
		scenes[2].addDoor(new Door(443, 101, 36, 177, Location.SCENE4, false, null, false, PointerType.RIGHT));  //porta direita
		
		scenes[3] = new Scene(Location.SCENE4, 2, 0);
		scenes[3].addDoor(new Door(36, 118, 24, 140, Location.SCENE5, false, null, true, PointerType.UP));  //escadas a esquerda
		scenes[3].addDoor(new Door(446, 143, 34, 130, Location.SCENE3, false, null, false, PointerType.RIGHT)); //porta direita
		
		scenes[4] = new Scene(Location.SCENE5, 4, 0);
		scenes[4].addDoor(new Door(188, 10, 110, 28, Location.SCENE8, true, ItemType.KEY2, true, PointerType.UP)); //porta em cima
		scenes[4].addDoor(new Door(5, 66, 44, 198, Location.SCENE9, false, null, false, PointerType.LEFT)); //primeira porta esquerda
		scenes[4].addDoor(new Door(385, 83, 30, 123, Location.SCENE4, false, null, true, PointerType.DOWN)); //escada a direita
		scenes[4].addDoor(new Door(435, 65, 39, 202, Location.SCENE7, false, null, false, PointerType.RIGHT)); //ultima porta a direita
		
		scenes[5] = new Scene(Location.SCENE6, 1, 0);
		scenes[5].addDoor(new Door(0, 131, 26, 163, Location.SCENE3, false, null, false, PointerType.LEFT)); //porta unica
		
		scenes[6] = new Scene(Location.SCENE7, 1, 0);
		scenes[6].addDoor(new Door(340, 117, 61, 120, Location.SCENE5, false, null, false, PointerType.UP)); //porta unica
		
		scenes[7] = new Scene(Location.SCENE8, 1, 0);
		scenes[7].addDoor(new Door(173, 290, 114, 30, Location.SCENE5, false, null, true, PointerType.DOWN)); //porta atras
		
		scenes[8] = new Scene(Location.SCENE9, 1, 0);
		scenes[8].addDoor(new Door(26, 142, 30, 115, Location.SCENE5, false, null, false, PointerType.LEFT)); //porta unica
	}
	
	public Scene findCurrentScene(Location currentLocation) {
		for (int i = 0; i < scenes.length; i++) {
			if (scenes[i].getLocation() == currentLocation) {
				return scenes[i];
			}
		}
		System.out.println("Cena atual nao encontrada");
		return null;
	}
	
	public static void manageEvents(Location currentLocation) {
		if (!World.arrivedScene3 && currentLocation == Location.SCENE3) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(8));
			World.arrivedScene3 = true;
		} else if(!World.arrivedScene4 && currentLocation == Location.SCENE4) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(9));
			World.arrivedScene4 = true;
			World.metFanta = true;
		} else if(!World.arrivedScene5 && currentLocation == Location.SCENE5) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(10));
			World.arrivedScene5 = true;
		} else if(!World.arrivedScene6 && currentLocation == Location.SCENE6) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(11));
			World.arrivedScene6 = true;
		} else if(!World.arrivedScene7 && currentLocation == Location.SCENE7) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(12));
			World.arrivedScene7 = true;
		} else if(!World.arrivedScene8 && currentLocation == Location.SCENE8) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(13));
			World.arrivedScene8 = true;
		} else if(!World.arrivedScene9 && currentLocation == Location.SCENE9) {
			GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(14));
			World.arrivedScene9 = true;
		}
	}
	
	public static void resetEvents() {
		World.arrivedScene3 = false;
		World.arrivedScene4 = false;
		World.arrivedScene5 = false;
		World.arrivedScene6 = false;
		World.arrivedScene7 = false;
		World.arrivedScene8 = false;
		World.arrivedScene9 = false;
		World.metFanta = false;
	}
	
}
