package interno.mygdx.casachorona.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import interno.mygdx.casachorona.control.ControlPlayer;
import interno.mygdx.casachorona.game.CasaChorona;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.ui.DialogueBox;
import interno.mygdx.casachorona.world.Scene;
import interno.mygdx.casachorona.world.World;
import interrno.mygdx.casachorona.graphics.BackgroundTextures;

public class GameScreen extends AbstractScreen {
	
	private SpriteBatch batch;
	private PlayerPointer player;
	private World world;
	private Scene currentScene;
	
	private ControlPlayer playerController;
	
	//private ScreenViewport gameViewport;
	
	private BackgroundTextures backgroundTextures;
	private Texture backgroundRender;
	
	private int uiScale = 1;
	
	private Stage uiStage;
	private Table dialogRoot;
	private DialogueBox dialogueBox;
	

	public GameScreen(CasaChorona game) {
		super(game);
		
		//gameViewport = new ScreenViewport();
		batch = new SpriteBatch();
		backgroundTextures = new BackgroundTextures();
		player = new PlayerPointer(Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE/2, Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE/2);
		world = new World();
		playerController = new ControlPlayer(player);
		
		initUI();
	}
	
	private void initUI() {
		uiStage = new Stage(new ScreenViewport());
		uiStage.getViewport().update(Settings.SCREEN_WIDTH/uiScale, Settings.SCREEN_HEIGHT/uiScale, true);
		
		dialogRoot = new Table();
		dialogRoot.setFillParent(true);
		uiStage.addActor(dialogRoot);
		
		dialogueBox = new DialogueBox(this.getApp().getSkin());
		dialogueBox.setVisible(false);
		//dialogueBox.animateText("Isto � um teste! Se o texto for\nescrito corretamente, esta funcionando.");
		
		
		Table dialogTable = new Table();
		dialogTable.add(dialogueBox).expand().align(Align.bottom).space(8f).row();


		dialogRoot.add(dialogTable).expand().align(Align.bottom);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(playerController);
	}

	@Override
	public void render(float delta) {
		
		//gameViewport.apply();
		currentScene = world.findCurrentScene(player.getCurrentLocation());
		uiStage.act(delta);
		
		batch.begin();
		
		//renderizar cenario
		backgroundRender = backgroundTextures.getSceneArt(currentScene.getLocation());
		batch.draw(backgroundRender, 0, 0, Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT *Settings.SCREEN_SCALE);
		
		batch.end();
		
		uiStage.draw();
		
		if (player.isClicked() & currentScene != null) {
			player.action(currentScene);
		}
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
