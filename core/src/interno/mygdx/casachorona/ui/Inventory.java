package interno.mygdx.casachorona.ui;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.model.Item;
import interno.mygdx.casachorona.model.ItemType;
import interrno.mygdx.casachorona.graphics.AssetTextures;

public class Inventory{
	
	private Item flashlight, hammer, password, key1, key2;
	private Item[] items;
	
	public Inventory() {
		this.flashlight = new Item(48, 9, 25, 25, ItemType.FLASHLIGHT);//48 139 230 318 408
		this.key1 = new Item(139, 9, 25, 25, ItemType.KEY1);
		this.password = new Item(230, 9, 25, 25, ItemType.PASSWORD);
		this.key2 = new Item(318, 9, 25, 25, ItemType.KEY2);
		this.hammer = new Item(408, 9, 25, 25, ItemType.HAMMER);
		this.items = new Item[5];
		items[0] = flashlight;
		items[1] = key1;
		items[2] = password;
		items[3] = key2;
		items[4] = hammer;
	}
	
	public void foundItem(ItemType type) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getType() == type) {
				if (!items[i].isPickedUp()) {
					items[i].pickUp();
				}
			}
		}
	}
	
	public boolean hasItem(int index) {
		return items[index].isPickedUp();
	}
	
	public Item getItem(int x, int y) { //procura se existe um item nesta coordenada, e retorna o item se houver
		for (int i = 0; i < this.items.length; i++) {;
			if (items[i].isPickedUp()) {
				if(x >= (this.items[i].getX()) & x <= (this.items[i].getX() + this.items[i].getWidth()) & y >= this.items[i].getY() & y <= (this.items[i].getY() + this.items[i].getHeight())) {
					return this.items[i];
				}
			}
		}
		return null; //item nao encontrada
	}
	
	public void resetItems() {
		for (int i = 0; i < items.length; i++) {
			items[i].reset();
		}
	}
	
	public void render(float delta, SpriteBatch batch, AssetTextures assetTextures) {
		for (int i = 0; i < 5; i++) {
			batch.draw(assetTextures.getInventoryBox(), (45 + i*(assetTextures.getInventoryBox().getWidth()+26))*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-assetTextures.getInventoryBox().getHeight()/2 - 5)*Settings.SCREEN_SCALE, assetTextures.getInventoryBox().getWidth(), assetTextures.getInventoryBox().getHeight());
			if (this.hasItem(i)) {
				batch.draw(assetTextures.getItem(i), (45 + i*(assetTextures.getInventoryBox().getWidth()+26))*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-assetTextures.getInventoryBox().getHeight()/2 - 5)*Settings.SCREEN_SCALE, assetTextures.getInventoryBox().getWidth(), assetTextures.getInventoryBox().getHeight());
			}
		}
	}
}
