package CommandPattern;

public class StereoOffCommand implements Command {
	Stereo stereo;
	final String SONG_NAME = "MyFavoriteSongs";
	final int VOLUME_LEVEL = 10;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
		stereo.setCD(SONG_NAME);
		stereo.setVolume(VOLUME_LEVEL);
	}
}
