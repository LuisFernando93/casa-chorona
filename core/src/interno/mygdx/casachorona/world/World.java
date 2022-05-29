package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.game.Settings;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 3;


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
	}
	
	public int findCurrentSceneIndex(Location currentLocation) {
		for (int i = 0; i < scenes.length; i++) {
			if (scenes[i].getLocation() == currentLocation) {
				return i+1;
			}
		}
		System.out.println("Cena atual nao encontrada");
		return 0;
	}
	
	public Door checkForDoor(int currentLocationIndex, int x, int y) { //procura se existe uma porta nesta coordenada, e retorna a porta se houver
		currentLocationIndex--;
		Door[] doors = scenes[currentLocationIndex].getDoors();
		for (int i = 0; i < doors.length; i++) {;
			if(x >= (doors[i].getX()) & x <= (doors[i].getX() + doors[i].getWidth()) & y >= doors[i].getY() & y <= (doors[i].getY() + doors[i].getHeight())) {
				System.out.println("porta encontrada");
				return doors[i];
			}
		}
		System.out.println("porta nao encontrada");
		return null; //porta nao encontrada
	}
	
}
