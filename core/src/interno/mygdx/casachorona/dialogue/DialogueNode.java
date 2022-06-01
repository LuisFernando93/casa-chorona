package interno.mygdx.casachorona.dialogue;

public class DialogueNode {

	private int pointer;

	private String text;
	private int id;
	
	private NodeType type;
	
	public enum NodeType {
		LINEAR,
		END;
	}
	
	public DialogueNode(String text, int id) {
		this.id = id;
		this.text = text;
		this.type = NodeType.END;
		this.pointer = -1;
	}
	
	public void setPointer (int nodeId) {
		this.pointer = nodeId;
		this.type = NodeType.LINEAR;
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
	
	public NodeType getType() {
		return this.type;
	}
}
