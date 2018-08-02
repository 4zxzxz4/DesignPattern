package CommandPattern;

// Invoker
public class SimpleRemoteControl {
	final int SLOT_MAXIMUM = 10;

	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	CommandLog commandLog;
	
	public SimpleRemoteControl() {
		onCommands = new Command[10];
		offCommands = new Command[10];
		Command noCommand = new NoCommand();
		
		for(int slotCounter = 0; slotCounter<SLOT_MAXIMUM; slotCounter++) {
			onCommands[slotCounter] = noCommand;
			offCommands[slotCounter] = noCommand;
		}
		
		undoCommand = noCommand;
		commandLog = new CommandLog();
	}
	
	public void setCommand(int slotNumber, Command onCommand, Command offCommand) {
		onCommands[slotNumber] = onCommand;
		offCommands[slotNumber] = offCommand;
	}
	
	public void onButtonWasPressed(int slotNumber) {
		onCommands[slotNumber].execute();
		undoCommand = onCommands[slotNumber];
		commandLog.getLog(onCommands[slotNumber]);
	}
	
	public void offButtonWasPressed(int slotNumber) {
		offCommands[slotNumber].execute();
		undoCommand = offCommands[slotNumber];
		commandLog.getLog(offCommands[slotNumber]);
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
		commandLog.getLog(undoCommand);
	}
}
