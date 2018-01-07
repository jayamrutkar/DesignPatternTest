package command.remotecontrol;

class Light{
	
	public void switchOn(){
		System.out.println("Switch On");
	}
	
	public void switchOff(){
		System.out.println("Switch Off.");
	}
}

interface Command{
	void execute();
}

class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.switchOn();
	}
	
}

class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.switchOff();
	}
	
}

class RemoteControl{
	
	private Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void pressButton(){
		command.execute();
	}
}

public class RemoteControlClient {

	public static void main(String[] args){
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		
		remoteControl.setCommand(lightOn);
		remoteControl.pressButton();
		
		remoteControl.setCommand(lightOff);
		remoteControl.pressButton();
	}

}
