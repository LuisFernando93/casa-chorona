package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.game.Settings;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 9;


	public World() {
		this.scenes = new Scene[nScenes];
		createWorld();
	}
	
	public void createWorld() {
		
		scenes[0] = new Scene(Location.SCENE1, 1);
		scenes[0].addDoor(new Door(420, 134, 27, 114, Location.SCENE2, false)); //porta direita
		
		scenes[1] = new Scene(Location.SCENE2, 2);
		scenes[1].addDoor(new Door(0, 138, 12, 160, Location.SCENE1, false));   //porta esquerda
		scenes[1].addDoor(new Door(468, 137, 12, 160, Location.SCENE3, false)); //porta direita
		
		scenes[2] = new Scene(Location.SCENE3, 3);
		scenes[2].addDoor(new Door(8, 139, 39, 139, Location.SCENE6, false));    //porta esquerda 
		scenes[2].addDoor(new Door(172, 300, 135, 20, Location.SCENE2, false));  //porta atras
		scenes[2].addDoor(new Door(443, 101, 36, 177, Location.SCENE4, false));  //porta direita
		
		scenes[3] = new Scene(Location.SCENE4, 2);
		scenes[3].addDoor(new Door(36, 118, 24, 140, Location.SCENE5, false));  //escadas a esquerda
		scenes[3].addDoor(new Door(446, 143, 34, 130, Location.SCENE3, false)); //porta direita
		
		scenes[4] = new Scene(Location.SCENE5, 4);
		scenes[4].addDoor(new Door(188, 10, 110, 28, Location.SCENE8, false)); //porta em cima
		scenes[4].addDoor(new Door(5, 66, 44, 198, Location.SCENE9, false)); //primeira porta esquerda
		scenes[4].addDoor(new Door(385, 83, 30, 123, Location.SCENE4, false)); //escada a direita
		scenes[4].addDoor(new Door(435, 65, 39, 202, Location.SCENE7, false)); //ultima porta a direita
		
		scenes[5] = new Scene(Location.SCENE6, 1);
		scenes[5].addDoor(new Door(0, 131, 26, 163, Location.SCENE3, false)); //porta unica
		
		scenes[6] = new Scene(Location.SCENE7, 1);
		scenes[6].addDoor(new Door(340, 117, 61, 120, Location.SCENE5, false)); //porta unica
		
		scenes[7] = new Scene(Location.SCENE8, 1);
		scenes[7].addDoor(new Door(173, 306, 114, 14, Location.SCENE5, false)); //porta atras
		
		scenes[8] = new Scene(Location.SCENE9, 1);
		scenes[8].addDoor(new Door(26, 142, 30, 115, Location.SCENE5, false)); //porta unica
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
	
}
