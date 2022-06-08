package interno.mygdx.casachorona.dialogue;

public class DialogueNode {

	private int pointer;

	private String text;
	private int id, voiceType;
	
	public DialogueNode(String text, int id) {
		this.id = id;
		this.text = text;
		this.pointer = id+1;
		this.voiceType = 1;
	}
	
	public DialogueNode(String text, int id, int voiceType) {
		this.id = id;
		this.text = text;
		this.pointer = id+1;
		this.voiceType = voiceType;
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
	
	public int getVoiceType() {
		return this.voiceType;
	}
}
