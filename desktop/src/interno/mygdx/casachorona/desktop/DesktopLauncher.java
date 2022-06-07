package interno.mygdx.casachorona.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import interno.mygdx.casachorona.game.CasaChorona;
import interno.mygdx.casachorona.game.Settings;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Settings.SCREEN_WIDTH * Settings.SCREEN_SCALE;
		config.height = Settings.SCREEN_HEIGHT * Settings.SCREEN_SCALE;
		config.resizable = false;
		config.title = "A Casa Chorona";
		config.addIcon("graphics/icon/icon128.png", FileType.Internal);
		config.addIcon("graphics/icon/icon32.png", FileType.Internal);
		config.addIcon("graphics/icon/icon16.png", FileType.Internal);
		new LwjglApplication(new CasaChorona(), config);
	}
}
