package interrno.mygdx.casachorona.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import interno.mygdx.casachorona.model.PointerType;

public class AssetTextures {
	
	private Texture spritesheet = new Texture(Gdx.files.internal("graphics/spritesheet.png"));
	private Sprite pointerDefaltImg, pointerHighlightImg, pointerUpImg, pointerDownImg, pointerLeftImg, pointerRightImg;
	private Sprite flashlightImg, hammerImg, penImg, key1Img, key2Img;
	private Sprite inventoryBox;
	private Sprite sledgehammerImg;
	
	
	public AssetTextures() {
		pointerDefaltImg = new Sprite(spritesheet, 73, 3, 17, 24);
		pointerHighlightImg = new Sprite(spritesheet, 105, 3, 17, 24);
		pointerUpImg = new Sprite(spritesheet, 136, 0, 14, 30);
		pointerDownImg = new Sprite(spritesheet, 168, 0, 14, 30);
		pointerLeftImg = new Sprite(spritesheet, 192, 8, 30, 14);
		pointerRightImg = new Sprite(spritesheet, 224, 8, 30, 14);
	}
	
	public Sprite getPlayerPointer(PointerType pointerType) {
		switch (pointerType) {
		case DEFAULT:
			return pointerDefaltImg;
		case HIGHLIGHT:
			return pointerHighlightImg;
		case UP:
			return pointerUpImg;
		case DOWN:
			return pointerDownImg;
		case LEFT:
			return pointerLeftImg;
		case RIGHT:
			return pointerRightImg;
		default:
			System.out.println("Sprite de ponteiro nao encontrada");
			return null;
		}
	}
}
