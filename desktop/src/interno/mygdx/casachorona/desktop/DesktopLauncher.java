package interno.mygdx.casachorona.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import interno.mygdx.casachorona.game.CasaChorona;
import interno.mygdx.casachorona.game.Settings;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE;
		config.height = Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE;
		new LwjglApplication(new CasaChorona(), config);
	}
}
