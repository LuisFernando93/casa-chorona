package interno.mygdx.casachorona.ui;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;

public class DialogueBox extends Table {
	
	private String targetText = "";
	private float animTimer = 0f;
	private float animationTotalTime = 0f;
	private float TIME_PER_CHARACTER = 0.05f;
	private STATE state = STATE.IDLE;
	
	private Label textLabel;
	
	private enum STATE {
		ANIMATING,
		IDLE,
		;
	}
	
	public DialogueBox(Skin skin) {
		super(skin);
		this.setBackground("dialoguebox");
		textLabel = new Label("\n", skin);
		this.add(textLabel).expand().align(Align.left).pad(5f);
	}
	
	public void animateText(String text) {
		this.targetText = text;
		this.animationTotalTime = text.length() * this.TIME_PER_CHARACTER;
		this.state = STATE.ANIMATING;
		this.animTimer = 0f;
	}
	
	public boolean isFinished() {
		if (this.state == STATE.IDLE) {
			return true;
		} else {
			return false;
		}
	}
	
	private void setText(String text) {
		if (!text.contains("\n")) {
			text += "\n";
		}
		this.textLabel.setText(text);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		if (state == STATE.ANIMATING) {
			this.animTimer += delta;
			if (this.animTimer > this.animationTotalTime) {
				state = STATE.IDLE;
				this.animTimer = this.animationTotalTime;
			}
			String currentlyDisplayingText = "";
			int charactersToDisplay = (int) ((this.animTimer/this.animationTotalTime) * this.targetText.length());
			for (int i = 0; i < charactersToDisplay; i++)
				currentlyDisplayingText += targetText.charAt(i);
			if (!currentlyDisplayingText.equals(this.textLabel.getText().toString()))
				setText(currentlyDisplayingText);
		}
	}
	
	@Override
	public float getPrefWidth() {
		return 360f;
	}
}
