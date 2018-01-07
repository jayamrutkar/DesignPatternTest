package command.produceconsumer;

import java.util.LinkedList;
import java.util.Queue;

interface Command{
	void execute();
}

class DomesticEngineer implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Domestic engineer, here is your challenge.");
	}
	
}

class MedicalOfficer implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Medical Officer, Verify all the medicines.");
	}
	
}

class Programmer implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Programmer, build software with these specified requirements.");
	}
	
}

public class CommandDemo {

	
	public static void main(String[] args){
		
		System.out.println("Produced here.");
		Queue<Command> queue = new LinkedList<Command>();
		queue.offer(new DomesticEngineer());
		queue.offer(new MedicalOfficer());
		queue.offer(new Programmer());
		
		System.out.println("Start consuming.");
		for(Command command: queue){
			command.execute();
		}
	}
	
}
