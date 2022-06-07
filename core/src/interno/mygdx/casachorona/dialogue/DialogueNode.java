package interno.mygdx.casachorona.dialogue;

public class DialogueNode {

	private int pointer;

	private String text;
	private int id;
	
	public DialogueNode(String text, int id) {
		this.id = id;
		this.text = text;
		this.pointer = id+1;
	}
	
	public void setEnd() {
		this.pointer = -1;
	}
	
	public int getPointer() {
		return this.pointer;
	}
	
	public String getText() {
		return this.text;
	}
	
	public int getId() {
		return this.id;
	}

}
