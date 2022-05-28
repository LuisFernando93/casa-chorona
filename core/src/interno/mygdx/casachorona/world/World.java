package interno.mygdx.casachorona.world;

public class World {
	
	private Scene[] scenes;
	private int nScenes = 3;


	public World() {
		this.scenes = new Scene[nScenes];
		createWorld();
	}
	
	public void createWorld() {
		scenes[0] = new Scene(Location.SCENE1, 1);
		scenes[1] = new Scene(Location.SCENE2, 2);
		scenes[2] = new Scene(Location.SCENE3, 1);
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
	

	
}
