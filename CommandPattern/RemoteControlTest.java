package CommandPattern;

import java.util.Scanner;

// Client
public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote= new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		Stereo stereo = new Stereo();
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, stereoOn, stereoOff);
		
		for(;;) {
			System.out.println("[0] on");
			System.out.println("[1] off");
			System.out.println("[2] undo");
			System.out.println("[3] termination");
			System.out.println("choose function : ");
			
			Scanner scanner = new Scanner(System.in);
			int selection = scanner.nextInt();
			
			if(selection == 0) {
				System.out.println("on chose");
				System.out.println("input slotNumber : ");
				int onSlotNumber = scanner.nextInt();
				remote.onButtonWasPressed(Integer.valueOf(onSlotNumber));
			} else if (selection == 1) {
				System.out.println("on chose");
				System.out.println("input slotNumber : ");
				int offSlotNumber = scanner.nextInt();
				remote.offButtonWasPressed(Integer.valueOf(offSlotNumber));
			} else if (selection == 2) {
				remote.undoButtonWasPressed();
			} else {
				scanner.close();
				return;
			}
		}
		
	}
}
