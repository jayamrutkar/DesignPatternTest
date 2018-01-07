package abstractfactory.board.toolkit.factory;

import abstractfactory.board.toolkit.products.CPU;
import abstractfactory.board.toolkit.products.EnginolaCPU;
import abstractfactory.board.toolkit.products.EnginolaMMU;
import abstractfactory.board.toolkit.products.MMU;

public class EnginolaFactory extends AbstractFactory {

	@Override
	protected
	CPU createCPU() {
		return new EnginolaCPU();
	}

	@Override
	protected
	MMU createMMU() {
		return new EnginolaMMU();
	}

}
