package abstractfactory.board.toolkit.factory;

import abstractfactory.board.toolkit.products.CPU;
import abstractfactory.board.toolkit.products.MMU;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("2017Q3".substring(0, 4));
		
		AbstractFactory factory = AbstractFactory.getInstance(null);
		
		AbstractFactory ember = AbstractFactory.getInstance(Architecture.EMBER);
		if(ember!=null){
			CPU cpu = ember.createCPU();
		}
		
		AbstractFactory enginola = AbstractFactory.getInstance(Architecture.ENGINOLA);
		if(enginola!=null){
			MMU mmu = enginola.createMMU();
		}
		
	}

}
