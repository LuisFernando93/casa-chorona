package interno.mygdx.casachorona.audio;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class AudioPlayer {
	
	private static Sound game = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/game soundtrack.wav"));
	private static Sound menu = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/menu soundtrack.wav"));
	private static Sound credits = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/credits soundtrack.wav"));
	private static Sound cutscene1 = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/custcene1 soundtrack.wav"));
	private static Sound cutsceneFanta = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/cutscene fanta soundtrack.wav"));
	private static Sound cutsceneEnding = Gdx.audio.newSound(Gdx.files.internal("audio/soundtrack/cutsceneEnding soundtrack.mp3"));
	private static Sound sfxMenu = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/menu sfx.mp3"));
	private static Sound sfxStair = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/stair sfx.mp3"));
	private static Sound sfxItem = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/item sfx.mp3"));
	private static Sound sfxDoor = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/door sfx.mp3"));
	private static Sound sfxUnlock = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/unlocked sfx.mp3"));
	private static Sound sfxLocked = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/locked sfx.mp3"));
	private static Sound sfxVoice1 = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/voice1 sfx.mp3"));
	private static Sound sfxVoice2 = Gdx.audio.newSound(Gdx.files.internal("audio/sfx/voice2 sfx.mp3"));
	
	public static void playSoundtrack(String name) {
		
		AudioPlayer.game.stop();
		AudioPlayer.menu.stop();
		AudioPlayer.credits.stop();
		AudioPlayer.cutscene1.stop();
		AudioPlayer.cutsceneFanta.stop();
		AudioPlayer.cutsceneEnding.stop();

		switch (name) {
		case "game":
			game.loop(0.025f);
			break;
		case "menu":
			menu.loop(0.025f);
			break;
		case "credits":
			credits.loop(0.025f);
			break;
		case "cutscene1":
			cutscene1.loop(0.025f);
			break;
		case "cutsceneFanta":
			cutsceneFanta.loop(0.025f);
			break;
		case "cutsceneEnding":
			cutsceneEnding.loop(0.2f);
			break;
		default:
			System.out.println("musica nao encontrada");
			break;
		}
	}
	
	public static void playSFX(String name) {
		switch (name) {
		case "menu":
			sfxMenu.play(0.1f);
			break;
		case "door":
			sfxDoor.play(0.1f);
			break;
		case "stair":
			sfxStair.play(0.1f);
			break;
		case "item":
			sfxItem.play(0.1f);
			break;
		case "locked":
			sfxLocked.play(1f);
			break;
		case "unlock":
			sfxUnlock.play(0.5f);
			break;
		case "voice1":
			sfxVoice1.play(0.08f);
			break;
		case "voice2":
			sfxVoice2.play(0.2f);
			break;
		default:
			System.out.println("som nao encontrado");
			break;
		}
	}
}
