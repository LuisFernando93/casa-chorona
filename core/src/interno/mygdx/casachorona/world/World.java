package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.game.Settings;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 8;


	public World() {
		this.scenes = new Scene[nScenes];
		createWorld();
	}
	
	public void createWorld() {
		
		scenes[0] = new Scene(Location.SCENE1, 1);
		scenes[0].addDoor(new Door(420 * Settings.SCREEN_SCALE, 134 * Settings.SCREEN_SCALE, 27 * Settings.SCREEN_SCALE, 114 * Settings.SCREEN_SCALE, Location.SCENE2));
		
		scenes[1] = new Scene(Location.SCENE2, 2);
		scenes[1].addDoor(new Door(0 * Settings.SCREEN_SCALE, 138 * Settings.SCREEN_SCALE, 12 * Settings.SCREEN_SCALE, 160 * Settings.SCREEN_SCALE, Location.SCENE1));
		scenes[1].addDoor(new Door(468 * Settings.SCREEN_SCALE, 137  * Settings.SCREEN_SCALE, 12 * Settings.SCREEN_SCALE, 160 * Settings.SCREEN_SCALE, Location.SCENE3));
		
		scenes[2] = new Scene(Location.SCENE3, 1);
		scenes[2].addDoor(new Door(8 * Settings.SCREEN_SCALE, 139 * Settings.SCREEN_SCALE, 39 * Settings.SCREEN_SCALE, 139  * Settings.SCREEN_SCALE, Location.SCENE2));
		
		scenes[3] = new Scene(Location.SCENE4, 2);
		
		scenes[4] = new Scene(Location.SCENE5, 5);
		
		scenes[5] = new Scene(Location.SCENE6, 1);
		
		scenes[6] = new Scene(Location.SCENE7, 1);
		
		scenes[7] = new Scene(Location.SCENE8, 1);
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
