package interrno.mygdx.casachorona.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import interno.mygdx.casachorona.world.Location;

public class BackgroundTextures {
	
	private Texture scene1art;
	private Texture scene2art;
	private Texture scene3art;
	private Texture scene4art;
	private Texture scene5art;
	private Texture scene6art;
	private Texture scene7art;
	private Texture scene8art;
	
	
	public BackgroundTextures() {
		this.scene1art = new Texture(Gdx.files.internal("graphics/garagem-scene1.png"));
		this.scene2art = new Texture(Gdx.files.internal("graphics/cozinha-scene2-1.png"));
		this.scene3art = new Texture(Gdx.files.internal("graphics/portaPrincipal-scene3.png"));
		this.scene4art = new Texture(Gdx.files.internal("graphics/sala-scene4.png"));
		this.scene5art = new Texture(Gdx.files.internal("graphics/corredor-scene5.png"));
		this.scene6art = new Texture(Gdx.files.internal("graphics/escritorio-scene6.png"));
		this.scene7art = new Texture(Gdx.files.internal("graphics/quartoPais-scene7.png"));
		this.scene8art = new Texture(Gdx.files.internal("graphics/sotao-scene8.png"));
	}

	public Texture getSceneArt(Location sceneLocation) {
		switch (sceneLocation) {
		case SCENE1: //cena 1
			return scene1art;
		case SCENE2: //cena 2
			return scene2art;			
		case SCENE3: //cena 3
			return scene3art;
		case SCENE4: //cena 4
			return scene4art;
		case SCENE5: //cena 5
			return scene5art;
		case SCENE6: //cena 6
			return scene6art;			
		case SCENE7: //cena 7
			return scene7art;
		case SCENE8: //cena 8
			return scene8art;
		default:
			System.out.println("erro ao carregar cenario");
			return null;
		}
	}
	
}
