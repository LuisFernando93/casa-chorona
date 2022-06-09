package interno.mygdx.casachorona.world;

public class Scene {

	private Location location;
	private Door[] doors;
	private SceneProp[] props;
	
	public Scene(Location location, int nDoors, int nProps) {
		this.location = location;
		this.doors = new Door[nDoors];
		this.props = new SceneProp[nProps];
	}
	
	public Location getLocation() {
		return this.location;
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
		System.out.println("porta nao inserida na cena");
	}
	
	public Door getDoor(int x, int y) { //procura se existe uma porta nesta coordenada, e retorna a porta se houver
		for (int i = 0; i < this.doors.length; i++) {;
			if (doors[i] != null) {
				if(x >= (this.doors[i].getX()) & x <= (this.doors[i].getX() + this.doors[i].getWidth()) & y >= this.doors[i].getY() & y <= (this.doors[i].getY() + this.doors[i].getHeight())) {
					return this.doors[i];
				}
			}
		}
		return null; //porta nao encontrada
	}
	
	public void addProp(SceneProp prop) {
		for (int i = 0; i < props.length; i++) {
			if (this.props[i] == null) {
				this.props[i] = prop;
				return;
			}
		}
		System.out.println("prop nao inserido na cena " + this.location);
	}
	
	public SceneProp getProp(int x, int y) { //procura se existe um prop nesta coordenada, e retorna o prop se houver
		for (int i = 0; i < this.props.length; i++) {;
			if (props[i] != null) {
				if(x >= (this.props[i].getX()) & x <= (this.props[i].getX() + this.props[i].getWidth()) & y >= this.props[i].getY() & y <= (this.props[i].getY() + this.props[i].getHeight())) {
					return this.props[i];
				}
			}
		}
		return null; //prop nao encontrado
	}
}