package CommandPattern;

public class StereoOnCommand implements Command {
	Stereo stereo;
	final String SONG_NAME = "default";
	final int VOLUME_LEVEL = 0;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
	}

	@Override
	public void undo() {
		stereo.off();
		stereo.setCD(SONG_NAME);
		stereo.setVolume(VOLUME_LEVEL);
	}
}
