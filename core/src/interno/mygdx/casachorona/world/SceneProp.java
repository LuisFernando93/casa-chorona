package interno.mygdx.casachorona.world;

import interno.mygdx.casachorona.model.PlayerPointer;

public class SceneProp implements Interactable {
	
	int x, y, width, height;
	int id;

	public SceneProp(int x, int y, int width, int height, int id) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
	public void interact(PlayerPointer player) {
		
	}
}
