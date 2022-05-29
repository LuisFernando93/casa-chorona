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
	
	public Door checkForDoor(int x, int y) { //procura se existe uma porta nesta coordenada, e retorna a porta se houver
		for (int i = 0; i < this.doors.length; i++) {;
			if(x >= (this.doors[i].getX()) & x <= (this.doors[i].getX() + this.doors[i].getWidth()) & y >= this.doors[i].getY() & y <= (this.doors[i].getY() + this.doors[i].getHeight())) {
				System.out.println("porta encontrada");
				return this.doors[i];
			}
		}
		System.out.println("porta nao encontrada");
		return null; //porta nao encontrada
	}
}
