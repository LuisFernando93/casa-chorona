package interrno.mygdx.casachorona.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class CutsceneTextures {
	
	private Texture emptyBlock;
	private Texture door;
	private Texture fantaAppears;
	private Texture safe;
	private Texture chest;
	private Texture intro1, intro2;
	private Texture ending1, ending2, ending3, ending4, ending5, ending6, ending7, ending8, ending9, ending10, ending11, ending12, ending13, ending14, ending15, ending16, ending17;
	
	private TextureRegion[] doorSprites = new TextureRegion[3];
	private TextureRegion[] fantaAppearsSprites = new TextureRegion[5];
	private TextureRegion[] safeSprites = new TextureRegion[3];
	private TextureRegion[] chestSprites = new TextureRegion[3];
	private TextureRegion[] intro1Sprites = new TextureRegion[3]; 
	private TextureRegion[] intro2Sprites = new TextureRegion[3];
	private TextureRegion[] ending1Sprites = new TextureRegion[3];
	private TextureRegion[] ending3Sprites = new TextureRegion[3];
	private TextureRegion[] ending12Sprites = new TextureRegion[3];
	private TextureRegion[] ending13Sprites = new TextureRegion[4];
	private TextureRegion[] ending14Sprites = new TextureRegion[3];
	private TextureRegion[] ending15Sprites = new TextureRegion[3];
	private TextureRegion[] ending16Sprites = new TextureRegion[5];
	
	public CutsceneTextures() {
		emptyBlock = new Texture(Gdx.files.internal("graphics/cutscenes/emptyBlock.png"));
		door = new Texture(Gdx.files.internal("graphics/cutscenes/door.png"));
		fantaAppears = new Texture(Gdx.files.internal("graphics/cutscenes/fantaAppears.png"));
		safe = new Texture(Gdx.files.internal("graphics/cutscenes/safe.png"));
		chest = new Texture(Gdx.files.internal("graphics/cutscenes/ending1-chest1.png"));
		intro1 = new Texture(Gdx.files.internal("graphics/cutscenes/opening1-friends.png"));
		intro2 = new Texture(Gdx.files.internal("graphics/cutscenes/opening2-house.png"));
		ending1 = new Texture(Gdx.files.internal("graphics/cutscenes/ending1-chest1.png"));
		ending2 = new Texture(Gdx.files.internal("graphics/cutscenes/ending2-chest2.png"));
		ending3 = new Texture(Gdx.files.internal("graphics/cutscenes/ending3-chest3.png"));
		ending4 = new Texture(Gdx.files.internal("graphics/cutscenes/ending4-happyFamily.png"));
		ending5 = new Texture(Gdx.files.internal("graphics/cutscenes/ending5-alcohol.png"));
		ending6 = new Texture(Gdx.files.internal("graphics/cutscenes/ending6-fatherDrunk.png"));
		ending7 = new Texture(Gdx.files.internal("graphics/cutscenes/ending7-fatherHolding.png"));
		ending8 = new Texture(Gdx.files.internal("graphics/cutscenes/ending8-FantaBeingHold.png"));
		ending9 = new Texture(Gdx.files.internal("graphics/cutscenes/ending9-hug.png"));
		ending10 = new Texture(Gdx.files.internal("graphics/cutscenes/ending10-key.png"));
		ending11 = new Texture(Gdx.files.internal("graphics/cutscenes/ending11-safeAndSound.png"));
		ending12 = new Texture(Gdx.files.internal("graphics/cutscenes/ending12-fantaWell.png"));
		ending13 = new Texture(Gdx.files.internal("graphics/cutscenes/ending13-FantaSmiling.png"));
		ending14 = new Texture(Gdx.files.internal("graphics/cutscenes/ending14-FantaSmilingIdle.png"));
		ending15 = new Texture(Gdx.files.internal("graphics/cutscenes/ending15-FantaLight.png"));
		ending16 = new Texture(Gdx.files.internal("graphics/cutscenes/ending16-FantaVanishing.png"));
		ending17 = new Texture(Gdx.files.internal("graphics/cutscenes/ending17-theend.png"));
		
		for (int i = 0; i < 3; i++) {
			doorSprites[i] = new TextureRegion(door, 318*i, 0, 318, 191);
			safeSprites[i] = new TextureRegion(safe, 318*i, 0, 318, 191);
			chestSprites[i] = new TextureRegion(chest, 318*i, 0, 318, 191);
			intro1Sprites[i] = new TextureRegion(intro1, 318*i, 0, 318, 191);
			intro2Sprites[i] = new TextureRegion(intro2, 318*i, 0, 318, 191);
			ending1Sprites[i] = new TextureRegion(ending1, 318*i, 0, 318, 191);
			ending3Sprites[i] = new TextureRegion(ending3, 318*i, 0, 318, 191);
			ending12Sprites[i] = new TextureRegion(ending12, 318*i, 0, 318, 191);
			ending14Sprites[i] = new TextureRegion(ending14, 318*i, 0, 318, 191);
			ending15Sprites[i] = new TextureRegion(ending15, 318*i, 0, 318, 191);
		}
		
		for (int i = 0; i < 4; i++) {
			ending13Sprites[i] = new TextureRegion(ending13, 318*i, 0, 318, 191);
		}
		
		for (int i = 0; i < 5; i++) {
			fantaAppearsSprites[i] = new TextureRegion(fantaAppears, 318*i, 0, 318, 191);
			ending16Sprites[i] = new TextureRegion(ending16, 318*i, 0, 318, 191);
		}
		
	}
	
	public Texture getEmptyBlock() {
		return emptyBlock;
	}
	
	public Texture getStaticTexture(String name) {
		switch (name) {
		case "ending2":
			return ending2;
		case "ending4":
			return ending4;
		case "ending5":
			return ending5;
		case "ending6":
			return ending6;
		case "ending7":
			return ending7;
		case "ending8":
			return ending8;
		case "ending9":
			return ending9;
		case "ending10":
			return ending10;
		case "ending11":
			return ending11;
		case "ending17":
			return ending17;
		default:
			System.out.println("Imagem nao encontrada");
			break;
		}
		return null;
	}
	
	public TextureRegion[] getAnimatedTextures(String name) {
		switch (name) {
		case "door":
			return doorSprites;
		case "safe":
			return safeSprites;	
		case "chest":
			return chestSprites;	
		case "fanta": 
			return fantaAppearsSprites;
		case "intro1": 
			return intro1Sprites;
		case "intro2": 
			return intro2Sprites;
		case "ending1": 
			return ending1Sprites;
		case "ending3": 
			return ending3Sprites;
		case "ending12": 
			return ending12Sprites;
		case "ending13": 
			return ending13Sprites;
		case "ending14": 
			return ending14Sprites;
		case "ending15": 
			return ending15Sprites;
		case "ending16": 
			return ending16Sprites;
		default:
			System.out.println("Imagem nao encontrada");
			break;
		}
		return null;
	}
}
