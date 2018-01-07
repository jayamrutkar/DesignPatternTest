package abstractfactory.board.toolkit.factory;

import abstractfactory.board.toolkit.products.CPU;
import abstractfactory.board.toolkit.products.MMU;

enum Architecture {
	EMBER, ENGINOLA;
}

public abstract class AbstractFactory {

	private static final EmberFactory EMBER_FACTORY = new EmberFactory();
	private static final EnginolaFactory ENGINOLA_FACTORY = new EnginolaFactory();

	public static AbstractFactory getInstance(Architecture arch) {

		AbstractFactory factory = null;

		switch (arch) {
		case EMBER:
			factory = EMBER_FACTORY;
			break;
		case ENGINOLA:
			factory = ENGINOLA_FACTORY;
			break;
		}

		return factory;
	}

	protected abstract CPU createCPU();

	protected abstract MMU createMMU();

}
