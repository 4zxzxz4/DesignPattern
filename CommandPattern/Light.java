package CommandPattern;

// Receiver
public class Light {
	private int status = 0;
	
	public void on() {
		status = 1;
	}
	
	public void off() {
		status = 0;
	}

	@Override
	public String toString() {
		return "Light [status=" + status + "]";
	}
}
