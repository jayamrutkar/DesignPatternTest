package abstractfactory.board.toolkit.factory;

import abstractfactory.board.toolkit.products.CPU;
import abstractfactory.board.toolkit.products.EmberCPU;
import abstractfactory.board.toolkit.products.EmberMMU;
import abstractfactory.board.toolkit.products.MMU;

public class EmberFactory extends AbstractFactory {

	@Override
	protected
	CPU createCPU() {
		return new EmberCPU();
	}

	@Override
	protected
	MMU createMMU() {
		return new EmberMMU();
	}

}
