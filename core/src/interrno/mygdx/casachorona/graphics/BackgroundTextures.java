package interrno.mygdx.casachorona.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class BackgroundTextures {
	
	private Texture scene1art;
	private Texture scene2art;
	private Texture scene3art;
	
	public BackgroundTextures() {
		this.scene1art = new Texture(Gdx.files.internal("graphics/garagem-scene1.png"));
		this.scene2art = new Texture(Gdx.files.internal("graphics/cozinha-scene2-1.png"));
		this.scene3art = new Texture(Gdx.files.internal("graphics/portaPrincipal-scene3.png"));
	}

	public Texture getSceneArt(int sceneIndex) {
		switch (sceneIndex) {
		case 1: //cena 1
			return scene1art;
		case 2: //cena 2
			return scene2art;			
		case 3: //cena 3
			return scene3art;
		default:
			System.out.println("erro ao carregar cenario");
			return null;
		}
	}
	
}
