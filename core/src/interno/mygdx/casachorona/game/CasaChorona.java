package interno.mygdx.casachorona.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import interno.mygdx.casachorona.control.ControlMouse;
import interno.mygdx.casachorona.screen.GameScreen;

public class CasaChorona extends Game {
	
	private GameScreen screen;
	private ControlMouse mouse;
	private Vector3 mouseClick;
	
	
	@Override
	public void create () {
		
		screen = new GameScreen(this);
		
		this.setScreen(screen);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0f, 0f, 0f, 1f);
		super.render();
	}

}
