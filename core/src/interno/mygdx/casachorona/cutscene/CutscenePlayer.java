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
		this.events.put(5, new CutsceneEvent(dialogueBox, cutsceneTextures, 5, 6)); //ending
		this.events.put(6, new CutsceneEvent(dialogueBox, cutsceneTextures, 6, 7));
		this.events.put(7, new CutsceneEvent(dialogueBox, cutsceneTextures, 7, 8));
		this.events.put(8, new CutsceneEvent(dialogueBox, cutsceneTextures, 8, 9));
		this.events.put(9, new CutsceneEvent(dialogueBox, cutsceneTextures, 9, 10));
		this.events.put(10, new CutsceneEvent(dialogueBox, cutsceneTextures, 10, 11));
		this.events.put(11, new CutsceneEvent(dialogueBox, cutsceneTextures, 11, 12));
		this.events.put(12, new CutsceneEvent(dialogueBox, cutsceneTextures, 12, 13));
		this.events.put(13, new CutsceneEvent(dialogueBox, cutsceneTextures, 13, 14));
		this.events.put(14, new CutsceneEvent(dialogueBox, cutsceneTextures, 14, 15));
		this.events.put(15, new CutsceneEvent(dialogueBox, cutsceneTextures, 15, 16));
		this.events.put(16, new CutsceneEvent(dialogueBox, cutsceneTextures, 16, 17));
		this.events.put(17, new CutsceneEvent(dialogueBox, cutsceneTextures, 17, 18));
		this.events.put(18, new CutsceneEvent(dialogueBox, cutsceneTextures, 18, 19));
		this.events.put(19, new CutsceneEvent(dialogueBox, cutsceneTextures, 19, 20));
		this.events.put(20, new CutsceneEvent(dialogueBox, cutsceneTextures, 20, 21));
		this.events.put(21, new CutsceneEvent(dialogueBox, cutsceneTextures, 21, 22));
		this.events.put(22, new CutsceneEvent(dialogueBox, cutsceneTextures, 22, -1)); //fim do ending
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
		case 22:
			GameScreen.setGameState("credits");
			AudioPlayer.playSoundtrack("credits");
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
