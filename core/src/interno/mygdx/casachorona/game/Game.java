package interno.mygdx.casachorona.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import interno.mygdx.casachorona.control.ControlMouse;
import interno.mygdx.casachorona.ui.DialogueBox;
import interno.mygdxcasachorona.util.SkinGenerator;

public class Game extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private AssetManager assetManager;
	private ControlMouse mouse;
	private Vector3 mouseClick;
	private Skin skin;
	
	private int uiScale = 2;
	
	private Stage uiStage;
	private Table dialogRoot;
	private DialogueBox dialogueBox;
	
	private void initUI() {
		uiStage = new Stage(new ScreenViewport());
		uiStage.getViewport().update(Gdx.graphics.getWidth()/uiScale, Gdx.graphics.getHeight()/uiScale, true);
		
		dialogRoot = new Table();
		dialogRoot.setFillParent(true);
		uiStage.addActor(dialogRoot);
		
		dialogueBox = new DialogueBox(skin);
		
		Table dialogTable = new Table();
		dialogTable.add(dialogueBox).expand().align(Align.bottom).space(8f).row();


		dialogRoot.add(dialogTable).expand().align(Align.bottom);
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		mouse = new ControlMouse();
		//initUI();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.5f, 0.8f, 0, 1);
		batch.begin();
		//objetos para renderizar
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
