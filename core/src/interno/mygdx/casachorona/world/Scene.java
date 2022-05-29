package interno.mygdx.casachorona.world;

public class Scene {

	private Location location;
	private int nDoors;
	private Door[] doors;
	
	public Scene(Location location, int nDoors) {
		this.location = location;
		this.nDoors = nDoors;
		this.doors = new Door[nDoors];
	}
	
	public Location getLocation() {
		return this.location;
	}
	
	public int getNDoors() {
		return this.nDoors;
	}
	
	public Door[] getDoors() {
		return this.doors;
	}
	
	public void addDoor(Door door) {
		for (int i = 0; i < doors.length; i++) {
			if (this.doors[i] == null) {
				this.doors[i] = door;
				return;
			}
		}
		System.out.println("todas as portas foram adicionadas na cena");
	}
}
