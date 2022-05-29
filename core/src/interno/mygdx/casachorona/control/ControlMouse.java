package interno.mygdx.casachorona.control;

import com.badlogic.gdx.InputAdapter;
import interno.mygdx.casachorona.model.PlayerPointer;

public class ControlMouse extends InputAdapter {
	
	private PlayerPointer player;

	public ControlMouse(PlayerPointer playerP) {
		this.player = playerP;
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
		player.hasClicked(screenX, screenY);
		System.out.println("Clicou! posicao x: " + screenX + " posicao y: " + screenY);
		return super.touchUp(screenX, screenY, pointer, button);
	}
	
}
