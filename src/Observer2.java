
public class Observer2 implements Observer{

	Subject observable;
	
	public Observer2(Subject observable){
		this.observable = observable;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("In update of "+this);
	}

	@Override
	public String toString() {
		return "Observer2 []";
	}

	
	public void unsubscribe(){
		observable.removeObserver(this);
	}
}
