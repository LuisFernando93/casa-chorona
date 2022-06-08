package interno.mygdx.casachorona.cutscene;

import java.util.HashMap;
import java.util.Map;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import interno.mygdx.casachorona.audio.AudioPlayer;
import interno.mygdx.casachorona.screen.GameScreen;
import interno.mygdx.casachorona.ui.DialogueBox;
import interrno.mygdx.casachorona.graphics.CutsceneTextures;

public class CutscenePlayer {

	private Map<Integer, CutsceneEvent> events = new HashMap<Integer, CutsceneEvent>();
	private static int activeCutscene = 0;
	private int lastCutscene;
	
	public CutscenePlayer(DialogueBox dialogueBox, CutsceneTextures cutsceneTextures) {
		this.events.put(0, new CutsceneEvent(dialogueBox, cutsceneTextures, 0, 1)); //intro
		this.events.put(1, new CutsceneEvent(dialogueBox, cutsceneTextures, 1, 2));
		this.events.put(2, new CutsceneEvent(dialogueBox, cutsceneTextures, 2, -1)); //fim da intro
		this.events.put(3, new CutsceneEvent(dialogueBox, cutsceneTextures, 3, -1)); //porta
		this.events.put(4, new CutsceneEvent(dialogueBox, cutsceneTextures, 4, -1)); //fanta
	}

	public static void setActiveCutscene(int activeCutscene) {
		CutscenePlayer.activeCutscene = activeCutscene;
	}
	
	private void exitPlayer() {
		switch (this.lastCutscene) {
		case 2:
			GameScreen.setGameState("game");
			AudioPlayer.playSoundtrack("game");
			break;
		
		case 3:
			GameScreen.setGameState("game");
			AudioPlayer.playSoundtrack("game");
			break;
		
		case 4:
			GameScreen.setGameState("game");
			AudioPlayer.playSoundtrack("game");
			break;
		}
	}
	
	public void render(float delta, SpriteBatch batch) {
		this.events.get(activeCutscene).render(delta, batch);
		if (this.events.get(activeCutscene).isEnded()) {
			this.events.get(activeCutscene).resetEvent();
			this.lastCutscene = activeCutscene;
			activeCutscene = this.events.get(activeCutscene).getPointer();
		}
		if (activeCutscene == -1) {
			this.exitPlayer();
		}
	}
}
