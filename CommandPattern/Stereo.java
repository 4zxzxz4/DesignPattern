package CommandPattern;

// Receiver
public class Stereo {
	private int status = 0;
	private String CD = "default";
	private int volume = 0;
	
	public void on() {
		this.status = 1;
	}
	
	public void off() {
		this.status = 0;
	}
	
	public void setCD(String CD) {
		this.CD = CD;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Stereo [status=" + status + ", CD=" + CD + ", volume=" + volume + "]";
	}
}
