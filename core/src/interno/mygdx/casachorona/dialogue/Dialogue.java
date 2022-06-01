package interno.mygdx.casachorona.dialogue;

import java.util.HashMap;
import java.util.Map;

public class Dialogue {

	private Map<Integer, DialogueNode> nodes = new HashMap<Integer, DialogueNode>();
	
	public DialogueNode getNode(int id) {
		return nodes.get(id);
	}
	
	public void addDialogueNode(DialogueNode node) {
		this.nodes.put(node.getId(), node);
	}
	
	public int getStart() {
		return 0;
	}
	
	public int size() {
		return nodes.size();
	}
}
