import java.util.ArrayList;
import java.util.List;


public class SubjectImpl implements Subject {

	int value;
	List<Observer> observers = new ArrayList<Observer>();
	
	public void setValue(int val){
		this.value = val;
	}
	
	
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers){
			o.update();
		}
	}

}
