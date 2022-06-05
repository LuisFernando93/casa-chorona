package interno.mygdx.casachorona.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import audio.SoundPlayer;
import interno.mygdx.casachorona.control.ControlDialogue;
import interno.mygdx.casachorona.control.ControlPlayer;
import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.game.CasaChorona;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.ui.DialogueBox;
import interno.mygdx.casachorona.world.Scene;
import interno.mygdx.casachorona.world.World;
import interrno.mygdx.casachorona.graphics.AssetTextures;
import interrno.mygdx.casachorona.graphics.BackgroundTextures;

public class GameScreen extends AbstractScreen {
	
	private SpriteBatch batch;
	private PlayerPointer player;
	private World world;
	private Scene currentScene;
	
	private InputMultiplexer multiplexer;
	private ControlPlayer playerController;
	private ControlDialogue dialogueController;
	
	//private ScreenViewport gameViewport;
	
	private BackgroundTextures backgroundTextures;
	private AssetTextures assetTextures;
	private Texture backgroundRender;
	private Sprite playerSprite;
	
	private int uiScale = 1;
	
	private Stage uiStage;
	private Table dialogRoot;
	private DialogueBox dialogueBox;

	public GameScreen(CasaChorona game) {
		super(game);
		
		initUI();
		batch = new SpriteBatch();
		backgroundTextures = new BackgroundTextures();
		assetTextures = new AssetTextures();
		
		player = new PlayerPointer(Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE/2, Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE/2);
		world = new World();
		DialogueDatabase.CreateDialogueDatabase();
		
		playerController = new ControlPlayer(player, dialogueBox);
		dialogueController = new ControlDialogue(dialogueBox);
		multiplexer = new InputMultiplexer();
		multiplexer.addProcessor(0, dialogueController);
		multiplexer.addProcessor(1, playerController);
		
		//dialogueController.startDialogue(DialogueDatabase.getDialogue(0)); //teste de dialogo
	}
	
	private void initUI() {
		uiStage = new Stage(new ScreenViewport());
		uiStage.getViewport().update(Settings.SCREEN_WIDTH/uiScale, Settings.SCREEN_HEIGHT/uiScale, true);
		
		dialogRoot = new Table();
		dialogRoot.setFillParent(true);
		uiStage.addActor(dialogRoot);
		
		dialogueBox = new DialogueBox(this.getApp().getSkin());
		dialogueBox.setVisible(false);
		
		
		Table dialogTable = new Table();
		dialogTable.add(dialogueBox).expand().align(Align.bottom).space(8f).row();


		dialogRoot.add(dialogTable).expand().align(Align.bottom);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(multiplexer);
		SoundPlayer.playSoundtrack("game");
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
		
		playerSprite = assetTextures.getPlayerPointer(player.getPointerType());
		batch.draw(playerSprite, player.getX(), Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE - player.getY() - playerSprite.getHeight(), playerSprite.getWidth(), playerSprite.getHeight());
		
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
