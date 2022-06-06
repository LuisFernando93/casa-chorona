package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PointerType;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 9;
	private boolean metFanta = false;
	private boolean arrivedScene3 = false;
	private boolean arrivedScene4 = false;
	private boolean arrivedScene5 = false;
	private boolean arrivedScene6 = false;
	private boolean arrivedScene7 = false;
	private boolean arrivedScene8 = false;
	private boolean arrivedScene9 = false;


	public World() {
		this.scenes = new Scene[nScenes];
		createWorld();
	}
	
	public boolean hasMeetFanta() {
		return this.metFanta;
	}
	
	public boolean hasArrivedScene9() {
		return this.arrivedScene9;
	}
	
	public void createWorld() {
		
		scenes[0] = new Scene(Location.SCENE1, 1, 1);
		
		scenes[0].addDoor(new Door(420, 134, 27, 114, Location.SCENE2, true, ItemType.FLASHLIGHT, false, PointerType.RIGHT)); //porta direita
		
		scenes[0].addProp(new SceneProp(313, 282, 37, 15, 0)); //lanterna
		
		
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
	
	public void manageEvents(Location currentLocation) {
		if (!this.arrivedScene3 && currentLocation == Location.SCENE3) {
			System.out.println("primeira vez na cena 3");
			this.arrivedScene3 = true;
		} else if(!this.arrivedScene4 && currentLocation == Location.SCENE4) {
			this.arrivedScene4 = true;
			this.metFanta = true;
		} else if(!this.arrivedScene5 && currentLocation == Location.SCENE5) {
			this.arrivedScene5 = true;
		} else if(!this.arrivedScene6 && currentLocation == Location.SCENE6) {
			this.arrivedScene6 = true;
		} else if(!this.arrivedScene7 && currentLocation == Location.SCENE7) {
			this.arrivedScene7 = true;
		} else if(!this.arrivedScene8 && currentLocation == Location.SCENE8) {
			this.arrivedScene8 = true;
		} else if(!this.arrivedScene9 && currentLocation == Location.SCENE9) {
			this.arrivedScene9 = true;
		}
	}
	
	public void resetEvents() {
		this.arrivedScene3 = false;
		this.arrivedScene4 = false;
		this.arrivedScene5 = false;
		this.arrivedScene6 = false;
		this.arrivedScene7 = false;
		this.arrivedScene8 = false;
		this.arrivedScene9 = false;
		this.metFanta = false;
	}
	
}
