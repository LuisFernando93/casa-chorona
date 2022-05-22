package interno.mygdx.casachorona.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.ScreenUtils;

import interno.mygdx.casachorona.control.ControlMouse;
import interno.mygdx.casachorona.ui.DialogueBox;

public class Game extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private ControlMouse mouse;
	private Vector3 mouseClick;
	
	private Table root;
	private DialogueBox dialogueBox;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		mouse = new ControlMouse();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.5f, 0.8f, 0, 1);
		batch.begin();
		
		batch.end();
		
		if (mouse.clickedPosition() != null) {
			mouseClick = mouse.clickedPosition();
			System.out.println("Clicou! posicao x: " + mouseClick.x + " posicao y: " + mouseClick.y);
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
