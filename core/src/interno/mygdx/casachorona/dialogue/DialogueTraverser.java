package interno.mygdx.casachorona.dialogue;

public class DialogueTraverser {

	private Dialogue dialogue;
	private DialogueNode currentNode;
	
	public DialogueTraverser(Dialogue dialogue) {
		this.dialogue = dialogue;
		currentNode = dialogue.getNode(dialogue.getStart());
	}
	
	public DialogueNode getNextNode() {
		if (currentNode.getPointer() == -1) {
			return null;
		}
		DialogueNode nextNode = dialogue.getNode(currentNode.getPointer());
		currentNode = nextNode;
		return nextNode;
	}
	
	public DialogueNode getNode() {
		return currentNode;
	}
}
