package interno.mygdx.casachorona.control;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.InputAdapter;
import interno.mygdx.casachorona.model.PlayerPointer;
import interno.mygdx.casachorona.ui.DialogueBox;
public class ControlPlayer extends InputAdapter {
	
	private PlayerPointer player;
	private DialogueBox dialogueBox;

	public ControlPlayer(PlayerPointer playerP, DialogueBox dialogueBox) {
		this.player = playerP;
		this.dialogueBox = dialogueBox;
	}
	
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		if (screenX != player.getX() || screenY != player.getY()) {
			player.movePointer(screenX, screenY);
			return true;
		} else return false;
	}
	
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		if (button == Buttons.LEFT && !dialogueBox.isVisible()) {
			player.hasClicked(screenX, screenY);
			System.out.println("Clicou! posicao x: " + screenX + " posicao y: " + screenY);
			return true;
		}
		return false;
	}
	
}
