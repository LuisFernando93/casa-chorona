package interno.mygdx.casachorona.ui;

import interno.mygdx.casachorona.model.Item;
import interno.mygdx.casachorona.model.ItemType;

public class Inventory{
	
	private Item flashlight, hammer, pen, key1, key2;
	private Item[] items;
	
	public Inventory() {
		this.flashlight = new Item(48, 9, 25, 25, ItemType.FLASHLIGHT);
		this.hammer = new Item(139, 9, 25, 25, ItemType.HAMMER);
		this.pen = new Item(230, 9, 25, 25, ItemType.PEN);
		this.key1 = new Item(318, 9, 25, 25, ItemType.KEY1);
		this.key2 = new Item(408, 9, 25, 25, ItemType.KEY2);
		this.items = new Item[5];
		items[0] = flashlight;
		items[1] = hammer;
		items[2] = pen;
		items[3] = key1;
		items[4] = key2;
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
}
