package interrno.mygdx.casachorona.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import interno.mygdx.casachorona.model.ItemType;
import interno.mygdx.casachorona.model.PointerType;

public class AssetTextures {
	
	private Texture spritesheet = new Texture(Gdx.files.internal("graphics/spritesheet.png"));
	private Sprite pointerDefaltImg, pointerHighlightImg, pointerUpImg, pointerDownImg, pointerLeftImg, pointerRightImg;
	private Sprite flashlightImg, hammerImg, penImg, key1Img, key2Img;
	private Sprite inventoryBox;
	
	
	public AssetTextures() {
		pointerDefaltImg = new Sprite(spritesheet, 73, 3, 17, 24);
		pointerHighlightImg = new Sprite(spritesheet, 105, 3, 17, 24);
		pointerUpImg = new Sprite(spritesheet, 136, 0, 14, 30);
		pointerDownImg = new Sprite(spritesheet, 168, 0, 14, 30);
		pointerLeftImg = new Sprite(spritesheet, 192, 8, 30, 14);
		pointerRightImg = new Sprite(spritesheet, 224, 8, 30, 14);
		inventoryBox = new Sprite(spritesheet, 192, 96, 64, 64);
		flashlightImg = new Sprite(spritesheet, 64, 32, 64, 64);
		hammerImg = new Sprite(spritesheet, 128, 32, 64, 64);
		penImg = new Sprite(spritesheet, 192, 32, 64, 64);
		key1Img = new Sprite(spritesheet, 64, 96, 64, 64);
		key2Img = new Sprite(spritesheet, 128, 96, 64, 64);
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
	
	public Sprite getInventoryBox() {
		return inventoryBox;
	}
	
	public Sprite getItem(int index) {
		switch (index) {
		case 0:
			return flashlightImg;
		case 1:
			return hammerImg;
		case 2:
			return penImg;
		case 3:
			return key1Img;
		case 4:
			return key2Img;
		}
		System.out.println("Erro ao recuperar o sprite do item");
		return null;
	}
}
