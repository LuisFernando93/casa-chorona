package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[9];
	
	public static void CreateDialogueDatabase() {
		
		//tentar abrir porta trancada
		Dialogue dialogue = new Dialogue();
		DialogueNode node1 = new DialogueNode("A porta esta trancada.", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[0] = dialogue;
		
		//destrancar porta
		dialogue = new Dialogue();
		node1 = new DialogueNode("A porta foi destrancada!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[1] = dialogue;
		
		//item nao funciona
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso não funciona aqui!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[2] = dialogue;
		
		//pegar lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Olha só, uma lanterna, espero que esteja funcionando.\nTudo aqui tá meio que caindo aos pedaços...", 0);
		DialogueNode node2 = new DialogueNode("Funciona! Com isso, posso enxergar!", 1);
		node1.setPointer(1);
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[3] = dialogue;
		
		//interagir novamente com a lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu já peguei a lanterna!\nEla será bem útil!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[4] = dialogue;
		
		//porta trancada da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("A chave está na porta, mas não enxergo nada!", 0);
		node2 = new DialogueNode("Se tivesse uma lanterna, poderia\nver o que estou fazendo.", 1);
		node1.setPointer(1);
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[5] = dialogue;
		
		//destranca porta da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("Agora consigo abrir!", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[6] = dialogue;
		
		//interage,mas nao pega martelo
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso é bem grande. Eu poderia usar para me\nproteger caso tenha algum cara estranho aqui, né?", 0);
		node2 = new DialogueNode("Nah, não quero levar algo tão pesado.", 1);
		node1.setPointer(1);
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[7] = dialogue;
		
		//primeira vez na cena 3
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ah, achei a porta de entrada.", 0);
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[8] = dialogue;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}
