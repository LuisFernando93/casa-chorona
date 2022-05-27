package interno.mygdx.casachorona.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import interno.mygdx.casachorona.game.CasaChorona;
import interno.mygdx.casachorona.ui.DialogueBox;

public class GameScreen extends AbstractScreen {
	
	private SpriteBatch batch;
	
	private Skin skin;
	
	private int uiScale = 2;
	
	private Stage uiStage;
	private Table dialogRoot;
	private DialogueBox dialogueBox;

	public GameScreen(CasaChorona game) {
		super(game);
		
		batch = new SpriteBatch();
	}
	
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
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		batch.begin();
		
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {
		
	}

}
