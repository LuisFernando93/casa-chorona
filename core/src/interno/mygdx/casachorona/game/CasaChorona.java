package interno.mygdx.casachorona.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Cursor.SystemCursor;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.ScreenUtils;
import interno.mygdx.casachorona.screen.GameScreen;
import interno.mygdxcasachorona.util.SkinGenerator;

public class CasaChorona extends Game {
	
	private GameScreen screen;
	private AssetManager assetManager;
	private Skin skin;
	
	public Skin getSkin() {
		return skin;
	}
	
	@Override
	public void create () {
		
		assetManager = new AssetManager();
		assetManager.load("graphics_packed/ui/uipack.atlas", TextureAtlas.class);
		assetManager.load("font/Gamer.fnt", BitmapFont.class);
		assetManager.finishLoading();
		
		skin = SkinGenerator.generateSkin(assetManager);
		
		screen = new GameScreen(this);
		this.setScreen(screen);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0f, 0f, 0f, 1f);
		super.render();
	}

}
