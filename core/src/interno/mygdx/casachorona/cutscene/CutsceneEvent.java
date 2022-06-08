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
				AudioPlayer.playSoundtrack("cutsceneFanta");
				break;
			case 5:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(33));
				AudioPlayer.playSoundtrack("cutsceneEnding");
				break;
			case 6:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(34));
				break;
			case 7:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(35));
				break;
			case 8:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(36));
				break;
			case 9:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(37));
				break;
			case 10:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(38));
				break;
			case 11:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(39));
				break;
			case 12:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(40));
				break;
			case 13:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(41));
				break;
			case 14:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(42));
				break;
			case 15:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(43));
				break;
			case 16:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(44));
				break;
			case 17:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(45));
				break;	
			case 18:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(46));
				break;
			case 19:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(47));
				break;
			case 20:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(48));
				break;
			case 21:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(49));
				break;
			case 22:
				GameScreen.getDialogueController().startDialogue(DialogueDatabase.getDialogue(50));
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
		batch.draw(cutsceneTextures.getEmptyBlock(), 0, 0, Settings.SCREEN_WIDTH*Settings.SCREEN_SCALE, Settings.SCREEN_HEIGHT*Settings.SCREEN_SCALE);
		switch (id) {
		case 0:
			
			break;
		case 1:
			textureRegion = cutsceneTextures.getAnimatedTextures("intro1")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 2: 
			textureRegion = cutsceneTextures.getAnimatedTextures("intro2")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 3:
			textureRegion = cutsceneTextures.getAnimatedTextures("door")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 4:
			textureRegion = cutsceneTextures.getAnimatedTextures("fanta")[4];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 5:
			texture = cutsceneTextures.getStaticTexture("ending2");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 6:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending3")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 7:
			break;
		case 8:
			texture = cutsceneTextures.getStaticTexture("ending4");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 9:
			texture = cutsceneTextures.getStaticTexture("ending5");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 10:
			texture = cutsceneTextures.getStaticTexture("ending6");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 11:
			texture = cutsceneTextures.getStaticTexture("ending7");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 12:
			texture = cutsceneTextures.getStaticTexture("ending8");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 13:
			texture = cutsceneTextures.getStaticTexture("ending9");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 14:
			texture = cutsceneTextures.getStaticTexture("ending10");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 15:
			texture = cutsceneTextures.getStaticTexture("ending11");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 16:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending3")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 17:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending13")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;	
		case 18:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending13")[3];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 19:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending15")[0];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 20:
			textureRegion = cutsceneTextures.getAnimatedTextures("ending16")[2];
			batch.draw(textureRegion, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-textureRegion.getRegionHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		case 21:
			
			break;
		case 22:
			texture = cutsceneTextures.getStaticTexture("ending17");
			batch.draw(texture, 81*Settings.SCREEN_SCALE, (Settings.SCREEN_HEIGHT-33-texture.getHeight())*Settings.SCREEN_SCALE, 318*Settings.SCREEN_SCALE, 191*Settings.SCREEN_SCALE);
			break;
		default:
			System.out.println("Erro ao carregar cutscene");
			break;
		
		}
		if (!dialogueBox.isVisible()) {
			this.ended = true;
		}
	}
	
}
