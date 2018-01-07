
public class Observer1 implements Observer{

	Subject observable;
	
	public Observer1(Subject observable){
		this.observable = observable;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("In update of "+this);
	}

	@Override
	public String toString() {
		return "Observer1 []";
	}

	
	public void unsubscribe(){
		observable.removeObserver(this);
	}
}
