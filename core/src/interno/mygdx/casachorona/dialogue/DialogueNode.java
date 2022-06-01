package interno.mygdx.casachorona.dialogue;

import java.util.ArrayList;

public class DialogueNode {

	private int pointer;

	private String text;
	private int id;
	
	private NodeType type;
	
	public enum NodeType {
		LINEAR,
		END;
	}
}
