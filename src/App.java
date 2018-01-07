
public class App {

	public static void main(String[] args){
		
		Subject sub = new SubjectImpl();
		
		Observer o1 = new Observer1(sub);
		Observer o2 = new Observer2(sub);
		Observer o3 = new Observer3(sub);
		
		sub.addObserver(o1);
		sub.addObserver(o2);
		sub.addObserver(o3);
		
		sub.notifyObservers();
	
		o2.unsubscribe();
		sub.notifyObservers();

		sub.removeObserver(o3);
		sub.notifyObservers();
		
		
	}
	
}
