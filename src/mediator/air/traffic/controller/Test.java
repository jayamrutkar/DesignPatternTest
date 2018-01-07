package mediator.air.traffic.controller;

public class Test {

	public static void main(String[] args){
		
		IATCMediator mediator = new ATCMediator();
		Flight B185 = new Flight("B185",mediator,1000);
		Runway runway1 = new Runway(mediator);
		
		mediator.registerFlight(B185);
		mediator.registerRunway(runway1);
		//B185.getReady();

		System.out.println("Registered B185");
		System.out.println(mediator.getAllFlights());
		
		Flight B186 = new Flight("B186", mediator, 1500);
		mediator.registerFlight(B186);
		
		System.out.println("Registered B186");
		System.out.println(mediator.getAllFlights());
		//B186.getReady();
		//runway1.land();
		//B186.land();

		//B185.land();

		Flight A556 = new Flight("A556", mediator, 3500);
		mediator.registerFlight(A556);
		
		System.out.println("Registered A556");
		System.out.println(mediator.getAllFlights());
		
		Flight D460 = new Flight("D460", mediator, 2500);
		mediator.registerFlight(D460);
		
		System.out.println("Registered D460");
		System.out.println(mediator.getAllFlights());
	}
	
}
