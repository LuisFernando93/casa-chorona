package interno.mygdx.casachorona.cutscene;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import interno.mygdx.casachorona.audio.AudioPlayer;
import interno.mygdx.casachorona.dialogue.DialogueDatabase;
import interno.mygdx.casachorona.game.Settings;
import interno.mygdx.casachorona.screen.GameScreen;
import interno.mygdx.casachorona.ui.DialogueBox;
import interrno.mygdx.casachorona.graphics.CutsceneTextures;

public class CutsceneEvent {
	private DialogueBox dialogueBox;
	private int id, pointer;
	private CutsceneTextures cutsceneTextures;
	private float animTimer = 0f;
	private float animTimerTotal = 0f;
	private State state = State.IDLE;
	private TextureRegion textureRegion;
	private Texture texture;
	private boolean begin = true;
	private boolean ended = false;
	
	private enum State {
		ANIMATING,
		IDLE,
		;
	}
	
	public CutsceneEvent(DialogueBox dialogueBox, CutsceneTextures cutsceneTextures, int id, int pointer) {
		this.dialogueBox = dialogueBox;
		this.id = id;
		this.pointer = pointer;
		this.cutsceneTextures = cutsceneTextures;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getPointer() {
		return this.pointer;
	}
	
	public boolean isEnded() {
		return this.ended;
	}
	
	public void startDialogue() {
		if (this.begin) {
			this.begin = false;
			switch (id) {
			case 0:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(28));
				AudioPlayer.playSoundtrack("cutscene1");
				break;
			case 1:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(29));
				break;
			case 2:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(30));
				break;	
			case 3:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(31));
				break;
			case 4:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(9));
				break;
			default:
				break;
			}
		}
	}
	
	public void resetEvent() {
		this.begin = true;
		this.ended = false;
	}
	
	public void render(float delta, SpriteBatch batch) {
		this.startDialogue();
		switch (id) {
		case 0:
			batch.draw(cutsceneTextures.getEmptyBlock(), 0, 0, Settings.SCREEN_WIDTH*Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT*Settings.SCREEN_SCALE);
			break;
		case 1:
			batch.draw(cutsceneTextures.getEmptyBlock(), 0, 0, Settings.SCREEN_WIDTH*Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT*Settings.SCREEN_SCALE);
			textureRegion = cutsceneTextures.getAnimatedTextures("intro1")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 2: 
			batch.draw(cutsceneTextures.getEmptyBlock(), 0, 0, Settings.SCREEN_WIDTH*Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT*Settings.SCREEN_SCALE);
			textureRegion = cutsceneTextures.getAnimatedTextures("intro2")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 3:
			batch.draw(cutsceneTextures.getEmptyBlock(), 0, 0, Settings.SCREEN_WIDTH*Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT*Settings.SCREEN_SCALE);
			textureRegion = cutsceneTextures.getAnimatedTextures("door")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
		default:
			System.out.println("Erro ao carregar cutscene");
			break;
		
		}
		if (!dialogueBox.isVisible()) {
			this.ended = true;
		}
	}
	
}
