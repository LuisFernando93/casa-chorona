package interno.mygdx.casachorona.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Pixmap;
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
import interno.mygdx.casachorona.ui.Inventory;
import interno.mygdx.casachorona.world.Scene;
import interno.mygdx.casachorona.world.World;
import interrno.mygdx.casachorona.graphics.AssetTextures;
import interrno.mygdx.casachorona.graphics.BackgroundTextures;

public class GameScreen extends AbstractScreen {
	
	private SpriteBatch batch;
	private PlayerPointer player;
	private World world;
	private Scene currentScene;
	private Inventory inventory;
	
	private InputMultiplexer multiplexer;
	private ControlPlayer playerController;
	private static ControlDialogue dialogueController;
	
	//private ScreenViewport gameViewport;
	
	private BackgroundTextures backgroundTextures;
	private AssetTextures assetTextures;
	private Texture backgroundRender;
	private Sprite playerSprite;
	private Sprite inventorySprite;
	
	private int uiScale = 1;
	
	private Stage uiStage;
	private Table dialogRoot;
	private DialogueBox dialogueBox;

	public GameScreen(CasaChorona game) {
		super(game);
		
		Pixmap pixmap = new Pixmap(Gdx.files.internal("graphics/cursorHidden.png"));
		int xHotspot = 15, yHotspot = 15;
		Cursor cursor = Gdx.graphics.newCursor(pixmap, xHotspot, yHotspot);
		pixmap.dispose(); // We don't need the pixmap anymore
		Gdx.graphics.setCursor(cursor);
		
		initUI();
		batch = new SpriteBatch();
		backgroundTextures = new BackgroundTextures();
		assetTextures = new AssetTextures();
		inventorySprite = assetTextures.getInventoryBox();
		
		world = new World();
		inventory = new Inventory();
		player = new PlayerPointer(Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE/2, Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE/2, world, inventory);
		
		DialogueDatabase.CreateDialogueDatabase();
		
		playerController = new ControlPlayer(player, dialogueBox);
		dialogueController = new ControlDialogue(dialogueBox);
		multiplexer = new InputMultiplexer();
		multiplexer.addProcessor(0, dialogueController);
		multiplexer.addProcessor(1, playerController);
		
		//dialogueController.startDialogue(DialogueDatabase.getDialogue(0)); //teste de dialogo
	}
	
	public static ControlDialogue getDialogueController() {
		return dialogueController;
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
		
		for (int i = 0; i < 5; i++) {
			batch.draw(inventorySprite, (45 + i*(inventorySprite.getWidth()+26))*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-inventorySprite.getHeight()/2 - 5)*Settings.SCREEN_SCALE, inventorySprite.getWidth(), inventorySprite.getHeight());
			if (inventory.hasItem(i)) {
				batch.draw(assetTextures.getItem(i), (45 + i*(inventorySprite.getWidth()+26))*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-inventorySprite.getHeight()/2 - 5)*Settings.SCREEN_SCALE, inventorySprite.getWidth(), inventorySprite.getHeight());
			}
		}
		
		
		playerSprite = assetTextures.getPlayerPointer(player.getPointerType());
		if (player.hasSelectedItem()) {
			batch.draw(assetTextures.getPlayerPointer(player.getPointerType()), player.getX(), Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE - player.getY() - playerSprite.getHeight(), 32, 32);
		} else batch.draw(assetTextures.getPlayerPointer(player.getPointerType()), player.getX(), Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE - player.getY() - playerSprite.getHeight(), playerSprite.getWidth(), playerSprite.getHeight());
		
		
		batch.end();
		
		uiStage.draw();
		
		if (player.isClicked()) {
			player.action();
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
