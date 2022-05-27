package interno.mygdx.casachorona.screen;

import interno.mygdx.casachorona.game.CasaChorona;
import com.badlogic.gdx.Screen;

public abstract class AbstractScreen implements Screen {

	private CasaChorona app;
	
	public AbstractScreen(CasaChorona app) {
		this.app = app;
	}
	
	public CasaChorona getApp() {
		return this.app;
	}
	
	@Override
	public abstract void show();

	@Override
	public abstract void render(float delta);

	@Override
	public abstract void resize(int width, int height);

	@Override
	public abstract void pause();

	@Override
	public abstract void resume();

	@Override
	public abstract void hide();

	@Override
	public abstract void dispose();

}
