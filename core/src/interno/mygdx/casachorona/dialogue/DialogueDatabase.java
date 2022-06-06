package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[3];
	
	public static void CreateDialogueDatabase() {
		
		Dialogue dialogue = new Dialogue();
		DialogueNode node1 = new DialogueNode("A porta esta trancada.", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[0] = dialogue;
		
		dialogue = new Dialogue();
		node1 = new DialogueNode("A porta foi destrancada!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[1] = dialogue;
		
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso não funciona aqui!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[2] = dialogue;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}
