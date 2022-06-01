package interno.mygdx.casachorona.control;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputAdapter;

import interno.mygdx.casachorona.dialogue.Dialogue;
import interno.mygdx.casachorona.dialogue.DialogueNode;
import interno.mygdx.casachorona.dialogue.DialogueTraverser;
import interno.mygdx.casachorona.ui.DialogueBox;

public class ControlDialogue extends InputAdapter {
	
	private DialogueTraverser traverser;
	private DialogueBox dialogueBox;
	
	public ControlDialogue(DialogueBox dialogueBox) {
		this.dialogueBox = dialogueBox;
	}
	
	public boolean isDialogueShowing() {
		return dialogueBox.isVisible();
	}
	
	public void startDialogue(Dialogue dialogue) {
		this.traverser = new DialogueTraverser(dialogue);
		dialogueBox.setVisible(true);
		
		DialogueNode node = traverser.getNode();
		dialogueBox.animateText(node.getText());
	}
	
	private void progress() {
		DialogueNode node = traverser.getNextNode();
		dialogueBox.animateText(node.getText());
	}
	
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		if (dialogueBox.isVisible()) {
			return true;
		} else return false;
	}
	
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		if (dialogueBox.isVisible() && !dialogueBox.isFinished()) {
			return false;
		}
		if (traverser != null && button == Buttons.LEFT) {
			DialogueNode thisNode = traverser.getNode();
			if (thisNode.getPointer() == -1) { //fim do dialogo
				this.traverser = null;
				dialogueBox.setVisible(false);
			} else {
				progress();
			}
			return true;
		}
		
		if (dialogueBox.isVisible()) {
			return true;
		}
		
		return false;
	}
}
