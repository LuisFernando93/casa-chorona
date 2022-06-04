package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[1];
	
	public static void CreateDialogueDatabase() {
		Dialogue dialogue0 = new Dialogue();
		
		DialogueNode node1 = new DialogueNode("Isto é um teste", 0);
		DialogueNode node2 = new DialogueNode("Estou verificando o sistema de dialogo \nã  õ  ó  à  ê  ô  á ", 1);
		DialogueNode node3 = new DialogueNode("Parece estar funcionando corretamente", 2);
		DialogueNode node4 = new DialogueNode("Fim do teste", 3);
		
		node1.setPointer(1);
		node2.setPointer(2);
		node3.setPointer(3);
		
		dialogue0.addDialogueNode(node1);
		dialogue0.addDialogueNode(node2);
		dialogue0.addDialogueNode(node3);
		dialogue0.addDialogueNode(node4);
		
		DialogueDatabase.dialogues[0] = dialogue0;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}
