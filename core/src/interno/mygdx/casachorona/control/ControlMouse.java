package interno.mygdx.casachorona.control;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector3;

public class ControlMouse {
	
	private int x;
	private int y;

	public Vector3 clickedPosition() {
		x = Gdx.input.getX();
		y = Gdx.input.getY();
		
		if (Gdx.input.justTouched()) {
			Vector3 clickPosition = new Vector3();
			clickPosition.set(x, y, 0);
			return clickPosition;
		} else return null;
	}
	
	public int getMouseX() {
		return Gdx.input.getX();
	}
	
	public int getMouseY() {
		return Gdx.input.getX();
	}
}
